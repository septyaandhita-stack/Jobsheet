public class DataDosen23 {

    // Menampilkan semua data dosen:
    public void dataSemuaDosen(Dosen23[] arrayOfDosen23) {
        int no = 1;
        for (Dosen23 dsn23 : arrayOfDosen23) {
            System.out.println("----------------------------------");
            dsn23.tampilInfo(no);
            no++;
        }
    }

    // Jumlah dosen per jenis kelamin:
    public void jumlahDosenPerJenisKelamin(Dosen23[] arrayOfDosen23) {
        int pria = 0;
        int wanita = 0;

        for (Dosen23 dsn23 : arrayOfDosen23) {
            if (dsn23.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    // Rata-rata usia per jenis kelamin:
    public void rataUsiaPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen23 dsn23 : arrayOfDosen) {
            if (dsn23.jenisKelamin) {
                totalPria += dsn23.usia;
                jmlPria++;
            } else {
                totalWanita += dsn23.usia;
                jmlWanita++;
            }
        }
        double rataPria = jmlPria > 0 ? (double) totalPria / jmlPria : 0;
        double rataWanita = jmlWanita > 0 ? (double) totalWanita / jmlWanita : 0;

        System.out.println("rata-rata Usia Dosen Pria: " + rataPria);
        System.out.println("rata-rata Dosen Wanita : " + rataWanita);
    }

    // Dosen Paling Tua:
    public void infoDosenPalingTua(Dosen23[] arrayOfDosen23) {
        if (arrayOfDosen23.length == 0) {
            return;
        }
        Dosen23 tertua = arrayOfDosen23[0];
        for (Dosen23 dsn23 : arrayOfDosen23) {
            if (dsn23.usia > tertua.usia) {
                tertua = dsn23;
            }
        }
        System.out.println("Dosen Tertua: ");
        tertua.tampilInfo(1);
    }

    // Dosen Paling Muda:
    public void infoDosenPalingMuda(Dosen23[] arrayOfDosen23) {
        Dosen23 termuda = arrayOfDosen23[0];

        for (Dosen23 dsn23 : arrayOfDosen23) {
            if (dsn23.usia < termuda.usia) {
                termuda = dsn23;
            }
        }

        System.out.println("Dosen Termuda: ");
        termuda.tampilInfo(1);
    }
}