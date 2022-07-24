package repository;

import entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerDatabase {
    private static PlayerDatabase playerDatabase;
    private final List<Player> players = new ArrayList<>();

    private PlayerDatabase() {

    }

    public static PlayerDatabase getInstance(){
        if(playerDatabase==null) playerDatabase = new PlayerDatabase();
        return playerDatabase;
    }

    public List<Player> getAll() {
        return players;
    }

    public Optional<Player> getPlayerById(int id){
        return players.stream()
                .filter(player -> player.getId()==id)
                .findAny();
    }

    public void add(Player player){
        players.add(player);
    }

    public void deleteById(int id){
        getPlayerById(id).ifPresent(players::remove);
    }

    public void updatePlayer(Player player){
        Optional<Player> updatedPlayer;
        updatedPlayer = getPlayerById(player.getId());
        updatedPlayer.ifPresent(p ->{
            p.setFirstName(player.getFirstName());
            p.setLastName(player.getLastName());
            p.setBirthOfDate(player.getBirthOfDate());
            p.setNationalityId(player.getNationalityId());
        });

    }
}
