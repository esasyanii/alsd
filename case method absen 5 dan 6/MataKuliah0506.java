//Nama: Atiqah Fathin Fauziyyah. Absen:05. NIM: 244107060031
//Nama: Daysyani Sophi Masayu. Absen: 06. NIM: 244107060153

public class MataKuliah0506 {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah0506(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }

    @Override
    public String toString() {
        return "Kode: " + kode + " | Nama: " + nama + " | SKS: " + sks;
    }
}
