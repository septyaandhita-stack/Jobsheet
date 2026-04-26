import java.util.Scanner;

import JOBSHEET9.Mahasiswa23;

public class MahasiswaDemo23 {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        // int jumlahMhs = 5; 

        //MODIF 
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = Integer.parseInt(sc.nextLine());

        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23(jumlahMhs);

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            System.out.println("-----------------------");
            Mahasiswa23 m = new Mahasiswa23(nim, nama, kelas, ipk);
            list.tambah(m);

            System.out.println();
        }
        list.tampil();

        // melakukan pencarian data sequential
        System.out.println("---------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = Double.parseDouble(sc.nextLine());

        System.out.println("Mengunakan sequential searhing");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // pencarian data binary 
        System.out.println("---------------------------------");
        System.out.println("Menggunakan binary search");
        list.bubbleSort(); 
        int pss2 = list.findBinarySearch(cari, 0, list.idx - 1);
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // System.out.println("Data Mahasiswa : ");
        // list.tampil();

        // System.out.println("Data Mahasiswa : ");
        // list.tampil();

        // System.out.println("Data Mahasiswa sebelum sorting : ");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        // pencarian data binary 
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data Mahasiswa yang terurut menggunakan SELECTION SORT
        // (ASC) : ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)
        // : ");
        // list.insertionSort();
        // list.tampil();

    }
}