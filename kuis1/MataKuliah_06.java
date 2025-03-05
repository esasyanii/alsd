public class MataKuliah_06 {
    private String kodeMK;
    private String namaMK;
    private int sks;

    public MataKuliah_06(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        setSKS(sks);
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2!");
        }
    }

    public int getSKS() {
        return sks;
    }

    private void setSKS(int sks) {
        if (sks >= 2) {
            this.sks = sks;
        } else {
            System.out.println("SKS minimal harus 2, nilai tidak diubah!");
            this.sks = 2;
        }
    }
}
