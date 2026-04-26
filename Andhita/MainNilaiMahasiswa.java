import java.util.Scanner;
public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        int[] UTS = new int[n];
        int[] UAS =new int[n];

        // Input nilai
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nilai UTS:  ");
            UTS[i] = input.nextInt();
            System.out.print("Nilai UAS:  ");
            UAS[i] = input.nextInt();
        }

        int max = NilaiMahasiswa.maxUTS(UTS, 0, n - 1);
        int min = NilaiMahasiswa.minUTS(UTS, 0, n - 1);
        double rata = NilaiMahasiswa.rataUAS(UAS);

        System.out.println("\nHASIL");
        System.out.println("Nilai UTS tertinggi   : " + max);
        System.out.println("Nilai UTS terendah    :" + min);
        System.out.println("Rata-rata Nilai UAS   : " + rata);

        input.close();
    }
}