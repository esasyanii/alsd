public class DosenMain06 {
    public static void main(String[] args) {
        // Objek pertama menggunakan konstruktor default
        Dosen06 dosen1 = new Dosen06();

        // Objek kedua menggunakan konstruktor berparameter
        Dosen06 dosen2 = new Dosen06("D123", "Prof. Budi Santoso", true, 2010, "Kecerdasan Buatan");

        // Menampilkan informasi awal kedua objek
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();

        // Mengubah status aktif dosen pertama
        dosen1.setStatusAktif(true);

        // Menghitung masa kerja dosen kedua
        int masaKerja = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa kerja " + dosen2 + " adalah: " + masaKerja + " tahun.");

        // Mengubah bidang keahlian dosen pertama
        dosen1.ubahKeahlian("Data Science");

        // Menampilkan informasi setelah perubahan
        dosen1.tampilInformasi();
    }
}
