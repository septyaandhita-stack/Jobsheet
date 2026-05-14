package CM_2;

public class NodePembelian23 {
    int noAntrian;
    Pembeli23 data;
    NodePembelian23 prev;
    NodePembelian23 next;

    public NodePembelian23(NodePembelian23 prev, int noAntrian, Pembeli23 data, NodePembelian23 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.data = data;
        this.next = next;
    }

}