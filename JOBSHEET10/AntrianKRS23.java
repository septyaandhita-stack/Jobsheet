package JOBSHEET10;

public class AntrianKRS23 {
    Mahasiswa23[] data;
    int front, rear, size, max;

    int jumlahDilayani = 0;
    final int MAX_DILAYANI = 30;

    public AntrianKRS23(int max) {
        this.max = max;
        this.data = new Mahasiswa23[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Cek antian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Cek antian penuh
    public boolean isFull() {
        return size == max;
    }

    // Mengosongkan antrian
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    // Menambahkan antrian 
    public void enqueue(Mahasiswa23 dt) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }


    // Memanggil antrian (2 mhs)
    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Memanggil 2 mahasiswa:");

        for (int i = 0; i < 2; i++) {
            Mahasiswa23 mhs = data[front];
            mhs.tampilData();

            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
        }
    }
    
    // Menampilkan semua antrian
    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampilData();
            i = (i + 1) % max;
        }
    }

    // Menampilkan 2 terdepan
    public void tampil2Terdepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 mahasiswa");
            return;
        }
        int i = front;
        for (int j = 0; j < 2; j++) {
            data[i].tampilData();
            i = (i + 1) % max;
        }
    }

    // Menampilkan antrian paling akhir
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Kosong");
        } else {
            data[rear].tampilData();
        }
    }

    // Cek jumlah antrian
    public int getJumlahAntrian() {
        return size;
    }

    // Cek jumlah dilayani
    public int getJumlahDilayani() {
        return jumlahDilayani;
    }

    // Cek belum dilayani
    public int getSisaBelumDilayani() {
        return MAX_DILAYANI - jumlahDilayani;
    }
}
