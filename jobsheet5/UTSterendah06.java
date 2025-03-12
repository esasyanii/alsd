public class UTSterendah06 {
    public static int cariMinUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int minKiri = cariMinUTS(uts, left, mid);
        int minKanan = cariMinUTS(uts, mid + 1, right);
        return Math.min(minKiri, minKanan);
    }

    public static void main(String[] args) {
        int[] uts = {78, 85, 90, 92, 85, 92, 88, 82};
        int minUTS = cariMinUTS(uts, 0, uts.length - 1);
        System.out.println("Nilai UTS terendah: " + minUTS);
    }
}
