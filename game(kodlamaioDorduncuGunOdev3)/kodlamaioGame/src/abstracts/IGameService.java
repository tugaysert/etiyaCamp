package abstracts;

import entity.Campaign;
import entity.Game;

public interface IGameService {
    void add(Game game);
    void update(Game game);
    void delete(Game game);

}
