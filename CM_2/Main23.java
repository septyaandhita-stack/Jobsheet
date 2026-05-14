package CM_2;

import java.util.Scanner;

public class Main23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DLLPembelian23 antrian = new DLLPembelian23();
        DLLPesanan23 pesanan = new DLLPesanan23();

        int pilih;

        do {

            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Layani Pembeli");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    Pembeli23 pb = new Pembeli23(nama, hp);

                    antrian.addLast(pb);

                    System.out.println("Antrian berhasil ditambahkan");

                    System.out.println("Nomor Antrian : " + (antrian.noAntrian - 1));
                    break;

                case 2:

                    antrian.print();
                    break;

                case 3:

                    Pembeli23 dipanggil = antrian.removeFirst();

                    if (dipanggil != null) {

                        System.out.println("================================");
                        System.out.println("Melayani Pembeli");
                        System.out.println("Nama : " + dipanggil.namaPembeli);
                        System.out.println("================================");

                        System.out.print(
                                "Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print(
                                "Nama Pesanan : ");
                        String menu = sc.nextLine();

                        System.out.print(
                                "Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan23 ps = new Pesanan23(kode, menu, harga);

                        pesanan.addLast(ps);

                        System.out.println("Pesanan berhasil ditambahkan");
                    }

                    break;

                case 4:

                    pesanan.print();
                    break;

                case 5:

                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 5);

        sc.close();
    }
}