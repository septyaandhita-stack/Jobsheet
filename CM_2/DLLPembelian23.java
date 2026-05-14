package CM_2;

public class DLLPembelian23 {
    NodePembelian23 head;
    NodePembelian23 tail;
    int size;
    int noAntrian = 1;

    public DLLPembelian23() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }

        System.out.println("Data node pertama:");
        head.data.tampilInformasi();
    }

    public void addLast(Pembeli23 data) {

        NodePembelian23 newNode = new NodePembelian23(tail, noAntrian, data, null);

        noAntrian++;

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public Pembeli23 removeFirst() {

    if (isEmpty()) {
        System.out.println("Antrian kosong");
        return null;
    }

    Pembeli23 removed = head.data;

    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }

    size--;

    return removed;
}

    public void print() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        NodePembelian23 current = head;
        System.out.println("==============================");
        System.out.println(" DAFTAR ANTRIAN PEMBELI ");
        System.out.println("==============================");
        System.out.println("No\tNama Pembeli\tNo HP");

        while (current != null) {

            System.out.println(current.noAntrian + "\t" + current.data.namaPembeli + "\t\t" + current.data.noHp);

            current = current.next;
        }

        System.out.println("Jumlah antrian : " + size);
    }
}
