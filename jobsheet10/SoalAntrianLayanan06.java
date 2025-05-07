// Kelas SoalAntrianLayanan06
import java.util.LinkedList;

public class SoalAntrianLayanan06 {
    private LinkedList<SoalMahasiswa06> queue;
    private int maxAntrian;
    private int jumlahKRS;

    public SoalAntrianLayanan06(int maxAntrian) {
        this.queue = new LinkedList<>();
        this.maxAntrian = maxAntrian;
        this.jumlahKRS = 0;
    }

    public boolean isEmpty() { return queue.isEmpty(); }
    public boolean isFull() { return queue.size() >= maxAntrian; }
    public void clearQueue() { queue.clear(); jumlahKRS = 0; }

    public void addAntrian(SoalMahasiswa06 mhs) {
        if (!isFull()) {
            queue.add(mhs);
            System.out.println("Mahasiswa ditambahkan.");
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    public void panggilAntrian() {
        if (queue.size() >= 2) {
            System.out.println("Memanggil dua mahasiswa untuk KRS:");
            queue.removeFirst().tampilkanData();
            queue.removeFirst().tampilkanData();
            jumlahKRS += 2;
        } else {
            System.out.println("Tidak cukup mahasiswa dalam antrian!");
        }
    }

    public void tampilkanAntrian() {
        System.out.println("Daftar Antrian:");
        for (SoalMahasiswa06 mhs : queue) {
            mhs.tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        System.out.println("Dua Antrian Terdepan:");
        int count = Math.min(2, queue.size());
        for (int i = 0; i < count; i++) {
            queue.get(i).tampilkanData();
        }
    }

    public void tampilkanPalingAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Akhir:");
            queue.getLast().tampilkanData();
        }
    }

    public int jumlahAntrian() { return queue.size(); }
    public int jumlahProsesKRS() { return jumlahKRS; }
    public int jumlahBelumKRS() { return maxAntrian - jumlahKRS; }
}
