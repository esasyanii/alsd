public class BinaryTreeArray06 {
    Mahasiswa06[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray06() {
        dataMahasiswa = new Mahasiswa06[10];
        idxLast = -1;
    }

    void populateData(Mahasiswa06[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    // ➕ Menambahkan Mahasiswa ke array binary tree
    public void add(Mahasiswa06 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree sudah penuh!");
        }
    }

    // Traverse InOrder
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // Traverse PreOrder
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    public static void main(String[] args) {
        BinaryTreeArray06 bta = new BinaryTreeArray06();

        Mahasiswa06 mhs1 = new Mahasiswa06("244160121", "Ali", "A", 3.57);
        Mahasiswa06 mhs2 = new Mahasiswa06("244160185", "Candra", "C", 3.41);
        Mahasiswa06 mhs3 = new Mahasiswa06("244160221", "Badar", "B", 3.75);
        Mahasiswa06 mhs4 = new Mahasiswa06("244160220", "Dewi", "B", 3.35);
        Mahasiswa06 mhs5 = new Mahasiswa06("244160131", "Devi", "A", 3.48);
        Mahasiswa06 mhs6 = new Mahasiswa06("244160205", "Ehsan", "D", 3.61);
        Mahasiswa06 mhs7 = new Mahasiswa06("244160170", "Fizi", "B", 3.86);

        // Tambahkan data secara dinamis ke tree
        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        // Output Traversal
        System.out.println("\nInOrder Traversal Mahasiswa:");
        bta.traverseInOrder(0);

        System.out.println("\nPreOrder Traversal Mahasiswa:");
        bta.traversePreOrder(0);
    }

    
}
