public class MatkulContohSoal06 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Constructor 1: Menggunakan semua atribut
    public MatkulContohSoal06(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Constructor 2: Hanya kode dan nama (sks dan jumlahJam default 0)
    public MatkulContohSoal06(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Constructor 3: Tanpa parameter (default constructor)
    public MatkulContohSoal06() {
        this.kode = "TBA";
        this.nama = "Mata Kuliah Belum Ditentukan";
        this.sks = 0;
        this.jumlahJam = 0;
    }

}