public class RiwayatTransaksi06 {
    private TransaksiLayanan06[] transaksi;
    private int front, rear, size;

    public RiwayatTransaksi06(int kapasitas) {
        transaksi = new TransaksiLayanan06[kapasitas];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void tambahTransaksi(TransaksiLayanan06 t) {
        if (size < transaksi.length) {
            rear = (rear + 1) % transaksi.length;
            transaksi[rear] = t;
            size++;
        } else {
            System.out.println("Riwayat penuh, tidak bisa menambahkan transaksi baru.");
        }
    }

    public void tampilkanRiwayat() {
        System.out.println("-- Riwayat Transaksi --");
        int totalPendapatan = 0;
        for (int i = 0; i < size; i++) {
            int index = (front + i) % transaksi.length;
            transaksi[index].tampilkanTransaksi();
            totalPendapatan += transaksi[index].biaya;
        }
        System.out.println(">> Total Pendapatan Klinik: Rp " + totalPendapatan);
    }
}
