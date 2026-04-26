public class Mahasiswa23 {
    String nim, nama, kelas;
    double ipk;

    // kostruktor default
    Mahasiswa23() {
    }

    // konstruktor berparameter
    Mahasiswa23(String NIM, String Nama, String Kelas, double IPK) {
        this.nim = NIM;
        this.nama = Nama;
        this.kelas = Kelas;
        this.ipk = IPK;
    }

    // method tampil bertipe void
    void tampil() {
        System.out.println("Nama:  " + nama);
        System.out.println("NIM:   " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK:   " + ipk);
    }
}
