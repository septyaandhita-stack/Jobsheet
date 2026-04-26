import java.util.Scanner;

import JOBSHEET9.Mahasiswa23;

public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // data mahasiswa
        Mahasiswa23[] mhs = {
                new Mahasiswa23("22001", "Andi", "Teknik Informatika", "0821234567"),
                new Mahasiswa23("22002", "Budi", "Teknik Informatika", "0812345678"),
                new Mahasiswa23("22003", "Citra", "Teknik Informatika", "0813456789") };

        // data buku
        Buku23[] buku = {
                new Buku23("B001", "Algoritma", "Polinema", 2018),
                new Buku23("B002", "Basis Data", "Polinema", 2018),
                new Buku23("B003", "Pemrograman", "Polinema", 2020),
                new Buku23("B004", "Fisika", "Polinema", 2020) };

        // data pinjaman
        Peminjaman23[] peminjaman = {
                new Peminjaman23(mhs[0], buku[0], 7),
                new Peminjaman23(mhs[1], buku[1], 6),
                new Peminjaman23(mhs[2], buku[2], 10),
                new Peminjaman23(mhs[2], buku[2], 6),
                new Peminjaman23(mhs[1], buku[1], 4) };

        int pilih;

        // tampil sistem peminjaman
        do {

            System.out.println();
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                // menu 1 tampil mahasiswa
                case 1:
                    for (Mahasiswa23 m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                // menu 2 tampil buku
                case 2:
                    for (Buku23 b : buku) {
                        b.tampilBuku();
                    }
                    break;

                // menu 3 tampil pinjaman
                case 3:
                    for (Peminjaman23 p : peminjaman) {
                        p.tampilPeminjaman();
                    }
                    break;

               

                case 4:
                    // Bubble sort DESC berdasarkan denda
                    for (int i = 0; i < peminjaman.length - 1; i++) {
                        for (int j = 0; j < peminjaman.length - i - 1; j++) {
                            if (peminjaman[j].denda < peminjaman[j + 1].denda) {
                                Peminjaman23 temp = peminjaman[j];
                                peminjaman[j] = peminjaman[j + 1];
                                peminjaman[j + 1] = temp;
                            }
                        }
                    }

                    int jumlahDenda = 0;

                    System.out.println("\n=== Data dengan Denda ===");
                    for (Peminjaman23 p : peminjaman) {
                        if (p.denda > 0) {
                            p.tampilPeminjaman(); // tampil data lengkap
                            System.out.println("Denda: " + p.denda); // tampil angka dendanya
                            System.out.println("----------------------");
                            jumlahDenda++;
                        }
                    }

                    System.out.println("Jumlah peminjaman yang terkena denda: " + jumlahDenda);
                    break;

                // menu 5 sequential search (NIM)
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = sc.nextLine();
                    boolean ditemukan = false;

                    for (Peminjaman23 p : peminjaman) {
                        if (p.mhs.nama.equalsIgnoreCase(cari)) {
                            p.tampilPeminjaman();
                            ditemukan = true;

                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}