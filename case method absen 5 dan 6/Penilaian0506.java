//Nama: Atiqah Fathin Fauziyyah. Absen:05. NIM: 244107060031
//Nama: Daysyani Sophi Masayu. Absen: 06. NIM: 244107060153

public class Penilaian0506 {
    private Mahasiswa0506 mahasiswa;
    private MataKuliah0506 mataKuliah;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Penilaian0506(Mahasiswa0506 mahasiswa, MataKuliah0506 mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

    public double hitungNilaiAkhir() {
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    //Metode untuk menghitung nilai akhir 
    public Mahasiswa0506 getMahasiswa() { return mahasiswa; }
    public MataKuliah0506 getMataKuliah() { return mataKuliah; }

    //Getter untuk mengambil objek mahasiswa dan mata kuliah.
    @Override
    public String toString() {
        return mahasiswa.getNama() + " | " + mataKuliah.getNama() + " | Nilai Akhir: " + hitungNilaiAkhir();
    }
}
