public class Fungsi {
    public static void main(String[] args) {
        // Data jumlah bunga yang tersedia di setiap cabang
        int[][] stockBunga = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        // Pengurangan stok akibat bunga mati
        int[] penguranganStok = {-1, -2, 0, -5};
        
        // Harga per jenis bunga
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        String[] jenisBunga = {"Aglaonema", "Keladi", "Alocasia", "Mawar"};
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

        System.out.println("========================================");
        System.out.println("     Pendapatan Setiap Cabang RoyalGarden     ");
        System.out.println("========================================");
        
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = hitungPendapatan(stockBunga[i], hargaBunga);
            System.out.println(String.format("%-20s : Rp %,d", cabang[i], pendapatan));
        }
        
        System.out.println("\n========================================");
        System.out.println("      Jumlah Stok Setiap Jenis Bunga     ");
        System.out.println("========================================");
        
        for (int i = 0; i < jenisBunga.length; i++) {
            int totalStok = hitungTotalStok(stockBunga, i);
            int stokAkhir = totalStok + penguranganStok[i];
            System.out.println(String.format("%-10s : %d (Setelah pengurangan: %d)", jenisBunga[i], totalStok, stokAkhir));
        }
        
        System.out.println("\n========================================");
        System.out.println("Informasi Tambahan: Pengurangan Stok Bunga yang Mati");
        System.out.println("========================================");
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.println(String.format("%-10s : %d", jenisBunga[i], penguranganStok[i]));
        }
    }

    // Fungsi untuk menghitung pendapatan satu cabang
    public static int hitungPendapatan(int[] stock, int[] harga) {
        int total = 0;
        for (int i = 0; i < stock.length; i++) {
            total += stock[i] * harga[i];
        }
        return total;
    }
    
    // Fungsi untuk menghitung total stok dari semua cabang
    public static int hitungTotalStok(int[][] stockBunga, int indexBunga) {
        int total = 0;
        for (int[] stock : stockBunga) {
            total += stock[indexBunga];
        }
        return total;
    }
}

