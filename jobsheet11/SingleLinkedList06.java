public class SingleLinkedList06 {
    NodeMahasiswa06 head;
    NodeMahasiswa06 tail;
    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa06 tmp = head;
            System.out.println("Isi Linked List:");
            System.out.printf("%-10s %-12s %-8s %s\n", "Nama", "NIM", "Kelas", "IPK");
            while (tmp != null) {
                System.out.printf("%-10s %-12s %-8s %.1f\n",
                    tmp.data.nama,
                    tmp.data.nim,
                    tmp.data.kelas,
                    tmp.data.ipk);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong\n");
        }
    }

    public void addFirst(Mahasiswa06 input) {
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa06 input) {
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa06 input) {
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        NodeMahasiswa06 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }while (temp != null);
    } 

    public void insertAt(int index, Mahasiswa06 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa06 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa06(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public Mahasiswa06 getData(int index){
        NodeMahasiswa06 tmp = head;
        for (int i = 0; i < index; i++){
            if (tmp == null || tmp.next == null && i < index - 1) {
                System.out.println("Index di luar batas!");
                return null;
            }
            tmp = tmp.next;
        }
        return tmp.data;
    }
    

    public int indexOf(String key) {
        NodeMahasiswa06 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
           head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            NodeMahasiswa06 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa06 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();;
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)){
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0){
            removeFirst();
        } else {
            NodeMahasiswa06 temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
