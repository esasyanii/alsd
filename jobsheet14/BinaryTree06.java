public class BinaryTree06 {
    Node06 root;

    public BinaryTree06() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa06 mahasiswa) {
        Node06 newNode = new Node06(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        }else{
            Node06 current = root;
            Node06 parent = null;
            while(true) {
             parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                        current = current.right;
                        if (current == null) {
                            parent.right = newNode;
                            return;
                        }
                    }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node06 current = root;
        while (current != null){
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if(ipk > current.mahasiswa.ipk){
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }
   void traversePreOrder(Node06 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
   }

   void traverseInOrder(Node06 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
   }

   void traversePostOrder(Node06 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
   }

    Node06 getSuccessor(Node06 del) {
        Node06 successor = del.right;
        Node06 SuccessorParent = del;
        while (successor.left != null) {
            SuccessorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            SuccessorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
   }

   void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node06 parent = root;
        Node06 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if(current.mahasiswa.ipk == ipk){
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root){
                    root = null;
                } else {
                    if(isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null) { // jika hanya punya 1 anak (kanan)
                if (current == root){
                    root = current.right;
                } else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null) { // jika phanya punya 1 anak (kiri)
                if (current == root){
                    root = current.left;
                } else {
                    if(isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //jika punya 2 anak
                Node06 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if(current == root) {
                    root = successor;
                } else {
                    if(isLeftChild){
                        parent.left = successor;
                    }else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
            
        }

    }
    
    public void addRekursif(Mahasiswa06 mhs) {
        root = tambahRekursif(root, mhs);
    }

    private Node06 tambahRekursif(Node06 current, Mahasiswa06 mhs) {
            if (current == null) {
                return new Node06(mhs);
            }
            if (mhs.ipk < current.mahasiswa.ipk) {
                current.left = tambahRekursif(current.left, mhs);
            } else {
                current.right = tambahRekursif(current.right, mhs);
            }
            return current;
    }

    public void cariMinIPK() {
        if (root == null) {
            System.out.println("Tree kosong");
            return;
        }
        Node06 current = root;
         while (current.left != null) {
            current = current.left;
        }
        
        System.out.println("Data dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (root == null) {
            System.out.println("Tree kosong");
            return;
        }
        Node06 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Data dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
    tampilRekursif(root, ipkBatas);
    }

    private void tampilRekursif(Node06 node, double ipkBatas) {
        if (node != null) {
            tampilRekursif(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilRekursif(node.right, ipkBatas);
        }
    }

    
}
