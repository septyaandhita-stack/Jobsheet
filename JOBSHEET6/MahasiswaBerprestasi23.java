import java.util.Scanner;

public class MahasiswaBerprestasi23 {
    Scanner sc = new Scanner(System.in);
    Mahasiswa23[] listMhs = new Mahasiswa23[5];
    int idx = 0;

    void tambah(Mahasiswa23 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa23 m : listMhs) {
            m.tampil();
            System.out.println("---------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa23 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int min = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[min].ipk) {
                    min = j;
                }
            }

            Mahasiswa23 temp = listMhs[i];
            listMhs[i] = listMhs[min];
            listMhs[min] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa23 temp = listMhs[i];
            int j = i;
            // yang dirubah ke dsc > jadi <
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    // method sequentialSearching 
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    //method tampilPosisi 
    void tampilPosisi(double x, int pos) {
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK :" + x + " Ditemukan pada indeks " + pos );
        } else {
            System.out.println("Data " + x + "Tidak ditemukan");
        }
    }

    // method tampilDataSearch
    void tampilDataSearch(double x, int pos) {
        if (pos != -1 ) {
            System.out.println("NIM\t   : " + listMhs[pos].nim);
            System.out.println("Nama\t  : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t   : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + "Tidak ditemukan");
        }
    }
    
}