public class Mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInformasi() {
        System.out.println("");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    // Method untuk mengubah kelas mahasiswa
    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    // Method untuk memperbarui IPK mahasiswa
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    // Method untuk menentukan nilai kinerja mahasiswa berdasarkan IPK
    public String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public Mahasiswa06(){

    }

    public Mahasiswa06 (String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }
}

  