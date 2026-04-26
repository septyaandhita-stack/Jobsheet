import JOBSHEET9.Mahasiswa23;

class Mahasiswa23 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    //konstruktor default
    Mahasiswa23(){
    }

    //konstruktor berparameter
    public Mahasiswa23 (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    //object baru dengan konstruktor berparameter
    Mahasiswa23 mahasiswaAndhita = new Mahasiswa23("Septya Andhita Pradhana", "254107060038", 3.80, "SI 2K");

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    //Modifikasi ipk baru
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
             ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }

    }
}