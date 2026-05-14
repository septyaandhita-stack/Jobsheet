package CM_2;

public class Pesanan23 {
    String namaPesanan;
    int kodePesanan,harga;

    public Pesanan23(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public void tampilInformasi() {
        System.out.println(kodePesanan + "\t" + namaPesanan + "\t" + harga);

    }
}