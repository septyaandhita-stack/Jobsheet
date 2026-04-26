package JOBSHEET9;

public class StackSurat23 {
    Surat23[] stack;
    int top;
    int size;

    public StackSurat23(int size) { 
        this.size = size;
        stack = new Surat23[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // 1. Terima surat
    public void push(Surat23 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    // 2. Proses surat
    public Surat23 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    // 3. Lihat surat terakhir
    public Surat23 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // 4. Cari surat
    public void cari(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampil();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}