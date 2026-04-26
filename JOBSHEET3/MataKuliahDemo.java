package JOBSHEET3;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");

        //MataKuliah23[] arrayOfMataKuliah23 = new MataKuliah23[3];

        // Modif no 4
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        MataKuliah23[] arrayOfMataKuliah23 = new MataKuliah23[jumlah];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------");

            // arrayOfMataKuliah23[i] = new MataKuliah23(kode, nama, sks, jumlahJam);
            // }
            arrayOfMataKuliah23[i] = new MataKuliah23("", "", 0, 0);
            arrayOfMataKuliah23[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n=== DATA MATAKULIAH ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah23[i].cetakInfo();
        }
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Data Matakuliah ke-" + (i + 1));
        //     System.out.println("Kode       : " + arrayOfMataKuliah23[i].kode);
        //     System.out.println("Nama       : " + arrayOfMataKuliah23[i].nama);
        //     System.out.println("Sks        : " + arrayOfMataKuliah23[i].sks);
        //     System.out.println("Jumlah Jam : " + arrayOfMataKuliah23[i].jumlahJam);
        //     System.out.println("---------------------------");
        // }

    }
}
