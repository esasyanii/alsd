public class DoubleLinkedList06 {
    Node06 head;
    Node06 tail;
    int size = 0;

    public DoubleLinkedList06() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa06 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node06 newNode = new Node06(data);
            Node06 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Mahasiswa06 dataTerhapus = head.data;

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }

            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
            dataTerhapus.tampil();
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node06 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;

            System.out.println("Data pada indeks " + index + " berhasil dihapus:");
            current.data.tampil();
            size--;
        }
    }

    public void removeAfter(String keyNim) {
        Node06 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("NIM tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM tersebut");
            return;
        }

        Node06 toRemove = current.next;
        current.next = toRemove.next;
        if (toRemove.next != null) {
            toRemove.next.prev = current;
        } else {
            tail = current;
        }

        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        toRemove.data.tampil();
        size--;
    }

    public void getFirst() {
        if (!isEmpty()) {
            head.data.tampil();
        } else {
            System.out.println("List kosong");
        }
    }

    public void getLast() {
        if (!isEmpty()) {
            tail.data.tampil();
        } else {
            System.out.println("List kosong");
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid");
            return;
        }

        Node06 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data.tampil();
    }

    public int size() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("=== PERINGATAN ===");
            System.out.println("Linked list masih kosong!");
            return;
        }
        Node06 current = head;
        System.out.println("Isi data dalam linked list:");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Node06 search(String nim) {
        Node06 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa06 data) {
        Node06 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM tersebut tidak ditemukan.");
            return;
        }

        Node06 newNode = new Node06(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
        size++;
    }
}
