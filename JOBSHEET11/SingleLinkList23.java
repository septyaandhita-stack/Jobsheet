package JOBSHEET11;

public class SingleLinkList23 {
    NodeMahasiswa23 head;
    NodeMahasiswa23 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa23 tmp = head;
            System.out.println("Isi linked list:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa23 input) {
        NodeMahasiswa23 ndInput = new NodeMahasiswa23(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa23 input) {
        NodeMahasiswa23 ndInput = new NodeMahasiswa23(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa23 input) {
        NodeMahasiswa23 ndInput = new NodeMahasiswa23(input, null);
        NodeMahasiswa23 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            } 
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa23 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa23 temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa23(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

}