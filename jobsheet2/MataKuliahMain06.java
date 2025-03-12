public class MataKuliahMain06 {
    public static void main(String[] args) {
        // Objek pertama menggunakan konstruktor default
        MataKuliah06 mk1 = new MataKuliah06();

        // Objek kedua menggunakan konstruktor berparameter
        MataKuliah06 mk2 = new MataKuliah06("IF101", "Pemrograman Java", 3, 4);

        // Menampilkan informasi awal kedua objek
        mk1.tampilInformasi();
        mk2.tampilInformasi();

        // Mengubah SKS dan jumlah jam pada mk2
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);

        // Menampilkan informasi setelah perubahan
        mk2.tampilInformasi();
    }
}
