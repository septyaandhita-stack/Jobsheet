class MataKuliah23 {
    String kodeMatkul;
    String nama;
    int sks;
    int jumlahJam;

    //konstruktor default
    MataKuliah23 () {
    }

    //konstruktor berparameter
    MataKuliah23 (String kodeMatkul, String nama, int sks, int jumlahJam){
        this.kodeMatkul = kodeMatkul;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Matkul: " + kodeMatkul);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Sks: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);

    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi. Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan");
        }
    }
}
