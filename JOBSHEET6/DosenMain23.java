public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 d1 = new Dosen23("1", "Septya", false, 19);
        Dosen23 d2 = new Dosen23("3", "Arya", true, 12);
        Dosen23 d3 = new Dosen23("2", "Andhita", false, 20);

        DataDosen23 listDosen = new DataDosen23();
        listDosen.tambah(d1);
        listDosen.tambah(d2);
        listDosen.tambah(d3);

        System.out.println("Data Sebelum Sorting");
        listDosen.tampil();
        System.out.println();

        System.out.println("Data Setelah Bubble Sort Asc");
        listDosen.bubbleSortASC();
        listDosen.tampil();
        System.out.println();

        System.out.println("Data Setelah Insertion Sort DESC");
        listDosen.insertionSortDESC();
        listDosen.tampil();
    }
}