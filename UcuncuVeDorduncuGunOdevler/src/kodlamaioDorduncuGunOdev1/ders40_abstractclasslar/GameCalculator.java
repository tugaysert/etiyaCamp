package kodlamaioDorduncuGunOdev1.ders40_abstractclasslar;

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver() {
        System.out.println("Game Over!");
    }
}
