public class MataKuliah06 {
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;

    // Konstruktor default
    public MataKuliah06() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Konstruktor berparameter
    public MataKuliah06(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method untuk menampilkan informasi mata kuliah
    public void tampilInformasi() {
        System.out.println("\n=== Informasi Mata Kuliah ===");
        System.out.println("Kode MK   : " + kodeMK);
        System.out.println("Nama      : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("=====================================");
    }

    // Method untuk mengubah jumlah SKS
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
        System.out.println("==========================================");
    }

    // Method untuk menambah jumlah jam
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam bertambah. Sekarang: " + jumlahJam + " jam.");
    }

    // Method untuk mengurangi jumlah jam dengan validasi
    public void kurangiJam(int jam) {
        if (jam > this.jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi!");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi. Sekarang: " + jumlahJam + " jam.");
        }
    }
}