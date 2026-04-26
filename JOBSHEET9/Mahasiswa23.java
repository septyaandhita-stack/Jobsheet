package JOBSHEET9;
public class Mahasiswa23 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa23() {}
    

    public Mahasiswa23(String nama, String nim, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    
    
}