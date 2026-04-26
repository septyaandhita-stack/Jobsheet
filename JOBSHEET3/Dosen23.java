public class Dosen23 {
    String kode;
    String nama;
    Boolean jenisKelamin; //True: Wanita, False: Pria 
    int usia;

    public Dosen23() {
        
    }

    public Dosen23(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilInfo(int urutan) {
        System.out.println("----------------------------------");
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Usia          : " + usia);
        System.out.println("----------------------------------");
    }
}
