public class Dosen23 {
        String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen23(String Kode, String Nama, boolean JenisKelamin, int Usia) {
        this.kode = Kode;
        this.nama = Nama;
        this.jenisKelamin = JenisKelamin;
        this.usia = Usia; 
    }

    void tampil(){
        System.out.println("Kode :" + kode);
        System.out.println("Nama :" + nama);
        System.out.println("Usia :" + usia);
        System.out.println("Jenis Kelamin :" + (jenisKelamin ? "Perempuan" : "Laki-laki") );
    }
}