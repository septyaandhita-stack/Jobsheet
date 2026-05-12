package JOBSHEET12.Tugas;

public class DoubleLinkedList23 {
    Node23 head;
    Node23 tail;
    int size;

    public DoubleLinkedList23() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
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
        size++;
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
        size++;
    }

    public void add(int index, Mahasiswa23 data) {

        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas.");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node23 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node23 newNode = new Node23(data);

        newNode.prev = current.prev;
        newNode.next = current;

        current.prev.next = newNode;
        current.prev = newNode;

        size++;
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
        size++;
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
        size--;
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
        size--;
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }
        Node23 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan key tidak ditemukan");
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah data tersebut.");
            return;
        }
        Node23 hapus = current.next;

        System.out.println("Data yang dihapus: ");
        hapus.data.tampilInformasi();

        if (hapus == tail) {
            tail = current;
            tail.next = null;
        } else {
            current.next = hapus.next;
            hapus.next.prev = current;
        }
        size--;
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas.");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {

            Node23 current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            System.out.println("Data yang dihapus:");
            current.data.tampilInformasi();

            current.prev.next = current.next;
            current.next.prev = current.prev;

            size--;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }

        System.out.println("Data node pertama:");
        head.data.tampilInformasi();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }

        System.out.println("Data node terakhir:");
        tail.data.tampilInformasi();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas.");
            return;
        }

        Node23 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data pada indeks ke-" + index + ":");
        current.data.tampilInformasi();
    }
}