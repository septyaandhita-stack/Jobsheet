package JOBSHEET11;

public class Mahasiswa23 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa23() {

    }

    Mahasiswa23(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}