public class RataUAS06 {
    public static double hitungRataUAS(int[] uas) {
        int total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return (double) total / uas.length;
    }

    public static void main(String[] args) {
        int[] uas = {82, 88, 79, 95, 87, 83, 90, 84};
        double rataUAS = hitungRataUAS(uas);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }
}
