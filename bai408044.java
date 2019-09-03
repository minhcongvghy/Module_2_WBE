public class bai408044 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
