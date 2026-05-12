package JOBSHEET12.Tugas;

public class Mahasiswa23 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa23() {

    }

    Mahasiswa23(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}