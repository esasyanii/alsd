class AntrianLayanan06 {
    private int max;
    private int front;
    private int rear;
    private int size;
    private Mahasiswa06[] data;

    public AntrianLayanan06(int max) {
        this.max = max;
        data = new Mahasiswa06[max];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void tambahAntrian(Mahasiswa06 mhs) {
        if (size == max) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        data[rear] = mhs;
        rear = (rear + 1) % max;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa06 layaniMahasiswa() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa06 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else {
            int index = (rear - 1 + max) % max;
            System.out.println("Mahasiswa paling belakang: ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}
