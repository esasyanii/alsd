public class Mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    int nilai;


    // Konstruktor dengan parameter
    public Mahasiswa06(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    // Method untuk mengeset nilai tugas
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public String infoMahasiswa() {
        return nama;
    }
}
