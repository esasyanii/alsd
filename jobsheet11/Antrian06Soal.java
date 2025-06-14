public class Antrian06Soal {
    private Mahasiswa06Soal front, rear;
    private int size;

    public Antrian06Soal() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(String nama, String nim) {
        Mahasiswa06Soal baru = new Mahasiswa06Soal(nama, nim);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println(nama + " (" + nim + ") berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa untuk dipanggil.");
        } else {
            Mahasiswa06Soal keluar = front;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            System.out.println(keluar.nama + " (" + keluar.nim + ") telah dipanggil dari antrian.");
        }
    }

    public void tampilkanAntrianTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: " + front.nama + " (" + front.nim + ")");
        }
    }

    public void tampilkanAntrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: " + rear.nama + " (" + rear.nim + ")");
        }
    }

    public void tampilkanJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar mahasiswa dalam antrian:");
            Mahasiswa06Soal current = front;
            int nomor = 1;
            while (current != null) {
                System.out.println(nomor + ". " + current.nama + " (" + current.nim + ")");
                current = current.next;
                nomor++;
            }
        }
    }
}
