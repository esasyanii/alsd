public class BinaryTreeMain06 {
    public static void main(String[] args) {
        BinaryTree06 bst = new BinaryTree06();

        bst.add(new Mahasiswa06("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa06("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa06("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa06("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal) : ");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari mahasiswa dengan ipj: 3.22 : ");
        hasilCari = bst.find(3.22)? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa06("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa06("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa06("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa: ");
        System.out.println("InOrder Traversal: ");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal: ");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal: ");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal): ");
        bst.traverseInOrder(bst.root);

        System.out.println("\nMenambahkan data menggunakan metode rekursif:");
        bst.addRekursif(new Mahasiswa06("244160300", "Gita", "C", 3.65));

        // Menampilkan daftar mahasiswa setelah penambahan rekursif
        System.out.println("\nDaftar mahasiswa setelah penambahan dengan rekursif (in order):");
        bst.traverseInOrder(bst.root);

        // Menampilkan mahasiswa dengan IPK terkecil
        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK();

        // Menampilkan mahasiswa dengan IPK terbesar
        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK();

        // Menampilkan mahasiswa dengan IPK di atas 3.5
        System.out.println("\nMahasiswa dengan IPK di atas 3.5:");
        bst.tampilMahasiswaIPKdiAtas(3.5);

    }
}
