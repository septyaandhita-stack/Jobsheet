import JOBSHEET9.Mahasiswa23;

public class Peminjaman23 {
    Mahasiswa23 mhs;
    Buku23 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat, denda;

    Peminjaman23(Mahasiswa23 mhs, Buku23 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    // method hitung denda
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat
                + " | Denda: " + denda);
    }
}
