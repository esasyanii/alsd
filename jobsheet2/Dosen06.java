public class Dosen06 {
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;

    // Konstruktor default
    public Dosen06() {
        this.idDosen = "D000";
        this.nama = "Nama Default";
        this.statusAktif = false;
        this.tahunBergabung = 2000;
        this.bidangKeahlian = "Umum";
    }

    // Konstruktor berparameter
    public Dosen06(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method untuk menampilkan informasi dosen
    public void tampilInformasi() {
        System.out.println("\n=== Informasi Dosen ===");
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    // Method untuk mengubah status aktif dosen
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status dosen telah diperbarui menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    // Method untuk menghitung masa kerja dosen
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method untuk mengubah bidang keahlian dosen
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}
