
import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah = 3;
        Dosen23[] arrayOfDosen = new Dosen23[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            Boolean jenisKelamin = sc.nextBoolean();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen23(kode, nama, jenisKelamin, usia);
            System.out.println("----------------------------------");
        }

        int i = 1;
        for (Dosen23 dsn : arrayOfDosen) {
        dsn.tampilInfo(i);
        i++;
        }

        DataDosen23 data = new DataDosen23();

        System.out.println("\n== DATA SEMUA DOSEN ==");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== RATA-RATA USIA PER JENIS KELAMIN ===");
        data.rataUsiaPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== DOSEN PALING TUA ===");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n=== DOSEN PALING MUDA ===");
        data.infoDosenPalingMuda(arrayOfDosen);
        sc.close();
    }
}