public class Surat06 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' = sakit, 'I' = izin keperluan lain
    int durasi;

    public Surat06() {
        this.idSurat = "";
        this.namaMahasiswa = "";
        this.kelas = "";
        this.jenisIzin = ' ';
        this.durasi = 0;
    }

    public Surat06(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public String infoSurat() {
        return "ID: " + idSurat +
               ", Nama: " + namaMahasiswa +
               ", Kelas: " + kelas +
               ", Jenis: " + jenisIzin +
               ", Durasi: " + durasi + " hari";
    }
}
