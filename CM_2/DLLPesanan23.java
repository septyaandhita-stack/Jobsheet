package CM_2;

public class DLLPesanan23 {

    NodePesanan23 head;
    NodePesanan23 tail;
    int size;

    public DLLPesanan23() {
        head = null;
        tail = null;
        size = 0;
    }

    // cek kosong
    public boolean isEmpty() {
        return head == null;
    }

    // tambah pesanan
    public void addLast(Pesanan23 data) {

        NodePesanan23 newNode =
            new NodePesanan23(tail, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // sorting nama pesanan
    public void sorting() {

        if (head == null) {
            return;
        }

        boolean tukar;

        do {

            tukar = false;

            NodePesanan23 current = head;

            while (current.next != null) {

                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {

                    Pesanan23 temp =
                        current.data;

                    current.data =
                        current.next.data;

                    current.next.data =
                        temp;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    // tampil laporan pesanan
    public void print() {

        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sorting();

        NodePesanan23 current = head;

        int total = 0;

        System.out.println("==============================");

        System.out.println("      LAPORAN PESANAN");

        System.out.println("==============================");

        System.out.println("Kode\tNama Menu\tHarga");

        while (current != null) {

            System.out.println(current.data.kodePesanan + "\t" + current.data.namaPesanan + "\t\t" + current.data.harga);

            total += current.data.harga;

            current = current.next;
        }

        System.out.println(
            "=============================="
        );

        System.out.println(
            "Total Pendapatan : "
            + total
        );
    }
}