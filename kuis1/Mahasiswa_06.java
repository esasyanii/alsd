public class Mahasiswa_06 {
    private String nim;
    private String nama;
    private int tahunMasuk;
    private MataKuliah_06[] mataKuliahDiambil;
    private int jumlahMK;

    public Mahasiswa_06(String nim, String nama, int tahunMasuk, int kapasitasMK) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new MataKuliah_06[kapasitasMK];
        this.jumlahMK = 0;
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Mata Kuliah Diambil:");
        for (int i = 0; i < jumlahMK; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
            System.out.println("-------------------");
        }
    }

    public void tambahMataKuliah(MataKuliah_06 mataKuliah) {
        if (jumlahMK < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMK] = mataKuliah;
            jumlahMK++;
        } else {
            System.out.println("Mata kuliah penuh, tidak bisa menambahkan lagi!");
        }
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            totalSKS += mataKuliahDiambil[i].getSKS();
        }
        return totalSKS;
    }
}
