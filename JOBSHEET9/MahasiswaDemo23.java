package JOBSHEET9;

import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat pengumpulan pertama");
            System.out.println("6. Menghitung jumlah tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.next();
                    System.out.print("NIM: ");
                    String nim = scan.next();
                    System.out.print("Kelas: ");
                    String kelas = scan.next();
                    Mahasiswa23 mhs = new Mahasiswa23(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa23 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.printf("Menilai tugas dari %s\n ", dinilai.nama);
                        System.out.println("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa23 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                // modifikasi
                case 5:
                    Mahasiswa23 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh: " + bawah.nama);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;

                // modifikasi
                case 6:
                    System.out.println("Jumlah tugas saat ini: " + stack.size());
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid.");
            }

        } while (pilih != 6);
    }
}