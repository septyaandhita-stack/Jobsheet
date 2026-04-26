package JOBSHEET9;

public class Surat23 {
    String namaMahasiswa;
    String nim;
    String kelas;
    char jenisIzin; // S = Sakit, I = Izin
    int durasi;

    public Surat23(String namaMahasiswa, String nim, String kelas, char jenisIzin, int durasi) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampil() {
        System.out.println(namaMahasiswa + "\t" + nim + "\t" + kelas + "\t" + jenisIzin + "\t" + durasi + " hari");
    }
}