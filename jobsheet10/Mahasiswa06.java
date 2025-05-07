public class Mahasiswa06 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    // Konstruktor Mahasiswa
    public Mahasiswa06(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    // Menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
