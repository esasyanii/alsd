public class Mahasiswa06Modif {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor dengan parameter
    public Mahasiswa06Modif(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.kelas = kelas;
        System.out.println("---------------------------------------");
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
    }
}
