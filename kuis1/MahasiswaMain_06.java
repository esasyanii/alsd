public class MahasiswaMain_06 {
    public static void main(String[] args) {
        Mahasiswa_06 mhs = new Mahasiswa_06("244107060153", "Daysyani Sophi Masayu", 2024, 5);
        MataKuliah_06 mk1 = new MataKuliah_06("MK001", "Algoritma dan Struktur Data", 3);
        MataKuliah_06 mk2 = new MataKuliah_06("MK002", "Basis Data", 4);

        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        mhs.tampilkanInfo();

        System.out.println("Total SKS: " + mhs.hitungTotalSKS());
    }
}
