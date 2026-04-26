public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 matkul1 = new MataKuliah23();
        matkul1.kodeMatkul = "SIB252005";
        matkul1.nama = "Praktikum Algoritma dan Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 6;

        matkul1.tampilInformasi();
        matkul1.ubahSks(4);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(3);
        matkul1.tampilInformasi();

        MataKuliah23 matkul2 = new MataKuliah23("SIB252005", "Praktikum Algoritma dan Struktur Data", 1, 3 );
        matkul2.sks = 2;
        matkul2.tampilInformasi();
    }   
}
