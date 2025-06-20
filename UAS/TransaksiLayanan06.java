public class TransaksiLayanan06 {
    Pasien06 pasien;
    Dokter06 dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan06(Pasien06 pasien, Dokter06 dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    private int hitungBiaya() {
        return durasiLayanan * 50000;
    }

    public void tampilkanTransaksi() {
        System.out.println(pasien.nama + " (" + durasiLayanan + " jam): Rp " + biaya);
    }
}
