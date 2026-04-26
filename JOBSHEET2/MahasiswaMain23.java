import JOBSHEET9.Mahasiswa23;

public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs = new Mahasiswa23();
        mhs.nama = "Septya Andhita Pradhana";
        mhs.nim = "254107060038";
        mhs.kelas = "SI 2J";
        mhs.ipk = 3.55;

        mhs.tampilkanInformasi();
        mhs.ubahKelas("SI 2K");
        mhs.updateIpk(3.60);
        mhs.tampilkanInformasi();

        Mahasiswa23 mhs2 = new Mahasiswa23("Septya Andhita Pradhana", "254107060038", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

       
    }
}
