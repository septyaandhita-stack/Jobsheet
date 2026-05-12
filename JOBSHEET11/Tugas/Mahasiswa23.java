package JOBSHEET11.Tugas;

public class Mahasiswa23 {
    String nim, nama, kelas, jurusan;
    double ipk;

    Mahasiswa23() {

    }

    Mahasiswa23(String nm, String name, String jurusan, String kls) {
        this.nim = nm;
        this.nama = name;
        this.jurusan = jurusan;
        this.kelas = kls;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}