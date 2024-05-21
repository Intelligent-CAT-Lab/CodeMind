public class p03704 {
    public static void main(String[] args) {
        int D = 63;
        int result = 0;
        for (int i = 1; i <= 20; i++) {
            result += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(result);
    }

    public static int f(int d, int x, int y) {
        int n = Integer.parseInt("9".repeat(x) + "0".repeat(y));
        return d == 0? (x < 1? 1 : 0) : sum(f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1? 1 : 0)) for i in range(-9, 10) if (Math.abs(d + i * n) < n));
    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
}