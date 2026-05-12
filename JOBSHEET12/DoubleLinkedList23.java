package JOBSHEET12;

public class DoubleLinkedList23 {
    Node23 head;
    Node23 tail;

    public DoubleLinkedList23() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa23 data) {
        Node23 newNode23 = new Node23(data);
        if (isEmpty()) {
            head = tail = newNode23;
        } else {
            head.prev = newNode23;
            newNode23.next = head;
            head = newNode23;
        }
    }

    public void addLast(Mahasiswa23 data) {
        Node23 newNode23 = new Node23(data);
        if (isEmpty()) {
            head = tail = newNode23;
        } else {
            tail.next = newNode23;
            newNode23.prev = tail;
            tail = newNode23;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa23 data) {
        Node23 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node23 newNode = new Node23(data);

        // jika current adalah tail, ndoe baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
            // node baru di sisipkan di tengah
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data behasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node23 current = head;

        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node23 current = tail;

        while (current != null) {
            current.data.tampilInformasi();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        } 

        // menampilkan yang dihapus
        System.out.println("Data yang dihapus: ");
        head.data.tampilInformasi();
        
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        } 

        // menampilkan data yag dihapus
        System.out.println("Data yang dihapus: ");
        tail.data.tampilInformasi();
        
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}