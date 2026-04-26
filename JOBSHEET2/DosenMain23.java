public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dosen = new Dosen23();
        dosen.idDosen = "D2000";
        dosen.nama = "Mawar S.Pd";
        dosen.statusAktif = true;
        dosen.tahunBergabung = 2000;
        dosen.bidangKeahlian = "Praktikum Algoritma dan Struktur Data";

        dosen.tampilInformasi();
        dosen.statusAktif(false);
        dosen.ubahKeahlian("Basis Data");
        System.out.println("Masa Kerja: " + dosen.hitungMasaKerja(2026) + "tahun");
        dosen.tampilInformasi();

        Dosen23 dosen2 = new Dosen23("D2000", "Mawar S.Pd", true, 2005, "Sistem Operasi");
        dosen2.tampilInformasi();
        dosen2.statusAktif(true);
        dosen2.ubahKeahlian("Algoritma dan Struktur Data");
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2026) + "tahun");
        dosen2.tampilInformasi();

    }
}
