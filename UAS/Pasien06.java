public class Pasien06 {
    String nama;
    String nik;
    String keluhan;
    int umur;
    double tinggiBadan;
    double beratBadan;
    Pasien06 next;

    public Pasien06(String nama, String nik, String keluhan, int umur, double tinggiBadan, double beratBadan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        this.next = null;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama pasien: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Keluhan: " + keluhan);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Berat Badan: " + beratBadan + " kg");
    }
}
