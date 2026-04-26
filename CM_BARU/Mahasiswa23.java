
public class Mahasiswa23 {
    String nim, nama, prodi, noHp;


    // membuat objek mahasiswa 
    Mahasiswa23(String NIM, String Nama, String Prodi, String noHp) {
        this.nim = NIM;
        this.nama = Nama;
        this.prodi = Prodi;
        this.noHp = noHp;
    }

    // method tampil data mahasiswa
    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama:  " + nama + " | Prodi: " + prodi + " | No Hp: " + noHp);
    }
}