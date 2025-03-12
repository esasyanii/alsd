public class UTStertinggi06 {
    public static int cariMaxUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int maxKiri = cariMaxUTS(uts, left, mid);
        int maxKanan = cariMaxUTS(uts, mid + 1, right);
        return Math.max(maxKiri, maxKanan);
    }

    public static void main(String[] args) {
        int[] uts = {78, 85, 90, 92, 85, 92, 88, 82};
        int maxUTS = cariMaxUTS(uts, 0, uts.length - 1);
        System.out.println("Nilai UTS tertinggi: " + maxUTS);
    }
}
