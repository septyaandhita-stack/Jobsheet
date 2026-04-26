package JOBSHEET3;
import java.util.Scanner;

import JOBSHEET9.Mahasiswa23;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa23 [] arrayOfMahasiswa23 = new Mahasiswa23 [3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa23[i] = new Mahasiswa23();
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     :");
            arrayOfMahasiswa23[i].nim = sc.nextLine();
            System.out.print("Nama    :");
            arrayOfMahasiswa23[i].nama = sc.nextLine();
            System.out.print("Kelas   :");
            arrayOfMahasiswa23[i].kelas = sc.nextLine();
            System.out.print("IPK     :");
            dummy = sc.nextLine();
            arrayOfMahasiswa23[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------");
            
        }

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa23[i].cetakInfo();
        }
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Data Mahasiswa ke-" + (i + 1));
        //     System.out.println("NIM    : " + arrayOfMahasiswa23[i].nim);
        //     System.out.println("Nama   : " + arrayOfMahasiswa23[i].nama);
        //     System.out.println("Kelas  : " + arrayOfMahasiswa23[i].kelas);
        //     System.out.println("Ipk    : " + arrayOfMahasiswa23[i].ipk);
        //     System.out.println("---------------------------------");

        // }   
        //arrayOfMahasiswa23[0] = new Mahasiswa23();
        //arrayOfMahasiswa23[0].nim = "244107060033";
        //arrayOfMahasiswa23[0].nama = "AGNES TITANIA KINANTI";
        //arrayOfMahasiswa23[0].kelas = "SIB-1E";
        //arrayOfMahasiswa23[0].ipk= (float) 3.75;

        //arrayOfMahasiswa23[1] = new Mahasiswa23();
        //arrayOfMahasiswa23[1].nim = "2341720172";
        //arrayOfMahasiswa23[1].nama = "ACHMAD MAULANA HAMZAH";
        //arrayOfMahasiswa23[1].kelas = "TI-1A";
        //arrayOfMahasiswa23[1].ipk = (float) 3.36;

        //arrayOfMahasiswa23[2] = new Mahasiswa23();
        //arrayOfMahasiswa23[2].nim = "244107023006";
        //arrayOfMahasiswa23[2].nama = "DIRHAMAWA PUTRANTO";
        //arrayOfMahasiswa23[2].kelas = "TI-2E";
        //arrayOfMahasiswa23[2].ipk = (float) 3.80;

        //System.out.println("NIM    : " + arrayOfMahasiswa23[0].nim );
        //System.out.println("Nama   : " + arrayOfMahasiswa23[0].nama);
        //System.out.println("Kelas  : " + arrayOfMahasiswa23[0].kelas);
        //System.out.println("IPK    : "+ arrayOfMahasiswa23[0].ipk);
        //System.out.println("---------------------------------------");
        //System.out.println("NIM    : " + arrayOfMahasiswa23[1].nim );
        //System.out.println("Nama   : " + arrayOfMahasiswa23[1].nama);
        //System.out.println("Kelas  : " + arrayOfMahasiswa23[1].kelas);
        //System.out.println("IPK    : "+ arrayOfMahasiswa23[1].ipk);
        //System.out.println("---------------------------------------");
        //System.out.println("NIM    : " + arrayOfMahasiswa23[2].nim );
        //System.out.println("Nama   : " + arrayOfMahasiswa23[2].nama);
        //System.out.println("Kelas  : " + arrayOfMahasiswa23[2].kelas);
        //System.out.println("IPK    : "+ arrayOfMahasiswa23[2].ipk);
        //System.out.println("---------------------------------------");
    }
}
