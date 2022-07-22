package ucuncuGunOdev1.ders39_overriding;

public class OgrenciKrediManager extends BaseKrediManager {
    @Override
    public double hesapla(double tutar) {
        return tutar *  1.08;
    }
}
