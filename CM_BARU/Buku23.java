public class Buku23 {
    String kodeBuku, judul, penerbit;
    int tahunTerbit;

    Buku23(String kodeBuku, String judul, String penerbit, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
    }

    void tampilBuku() {
        System.out.println("Kode Buku: " + kodeBuku + " | Judul: " + judul + " | Tahun Terbit: " + tahunTerbit + " | penerbit: " + penerbit);
    }
}
