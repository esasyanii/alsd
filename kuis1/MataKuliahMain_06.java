public class MataKuliahMain_06 {
    public static void main(String[] args) {
        MataKuliah_06 mk1 = new MataKuliah_06("MK001", "Algoritma Dan Struktur Data", 3);
        MataKuliah_06 mk2 = new MataKuliah_06("MK002", "Basis Data", 4);

        mk1.tampilkanInfo();
        mk2.tampilkanInfo();

        mk1.ubahNamaMK("Java Lanjutan");
        mk1.ubahSKS(2);
        mk1.tampilkanInfo();
    }
}
