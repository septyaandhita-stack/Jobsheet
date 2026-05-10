package JOBSHEET11;

public class SLLLMain23 {
    public static void main(String[] args) {
        SingleLinkList23 list = new SingleLinkList23();

        Mahasiswa23 mhs1 = new Mahasiswa23("24212200", "Alfaro", "1-A", 4.0);
        Mahasiswa23 mhs2 = new Mahasiswa23("23422201", "Bimon", "2-B", 3.8);
        Mahasiswa23 mhs3 = new Mahasiswa23("22422202", "Cintia", "3-C", 3.5);
        Mahasiswa23 mhs4 = new Mahasiswa23("21212203", "Dirga", "4-D", 3.6);
    
        list.print();
        list.addFirst(mhs4);
        list.print();
        list.addLast(mhs1);
        list.print();
        list.insertAfter("Dirga", mhs3);
        list.insertAt(2, mhs2);
        list.print();
    }
}
