package CM_2;
public class Pembeli23 {
    String namaPembeli, noHp, noAntrian;

    public Pembeli23(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampilInformasi() {
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("No HP        : " + noHp);
    }
}