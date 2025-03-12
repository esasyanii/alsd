public class Mahasiswa06soal4 {
    private String nim;
    private String nama;
    private String kelas;
    private double ipk;

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    // Method untuk mengubah kelas mahasiswa
    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    // Method untuk memperbarui IPK mahasiswa dengan validasi
    public void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
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
}