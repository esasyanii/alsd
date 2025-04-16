//Nama: Atiqah Fathin Fauziyyah. Absen:05. NIM: 244107060031
//Nama: Daysyani Sophi Masayu. Absen: 06. NIM: 244107060153

public class Mahasiswa0506 {
    private String nim;
    private String nama;
    private String prodi;

    public Mahasiswa0506(String nim, String nama, String prodi) {
        //atribut
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    //konstruktor
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getProdi() { return prodi; }

    //getter untuk mengakses atribut
    @Override
    public String toString() {
        return "NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi;
    }
}
