package JOBSHEET9;

import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat23 stack = new StackSurat23(10);

        int pilih;
        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); // penting!

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);

                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); // ← ini penting biar tidak bug

                    Surat23 s = new Surat23(nama, nim, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan!");
                    break;

                case 2:
                    Surat23 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat:");
                        proses.tampil();
                    }
                    break;

                case 3:
                    Surat23 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.tampil();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}