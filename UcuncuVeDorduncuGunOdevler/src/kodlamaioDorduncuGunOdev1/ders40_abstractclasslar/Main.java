package kodlamaioDorduncuGunOdev1.ders40_abstractclasslar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator[] gameCalculators = new GameCalculator[] {
                new WomanGameCalculator(),
                new ManGameCalculator(),
                new KidsGameCalculator()
        };

        Arrays.stream(gameCalculators).forEach(GameCalculator::hesapla);

    }
}
