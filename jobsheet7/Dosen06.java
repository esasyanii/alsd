public class Dosen06 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    // Konstruktor
    public Dosen06(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    // Method untuk menampilkan data dosen
    public void tampil() {
        String gender = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Jenis Kelamin: " + gender + ", Usia: " + usia);
    }
}
