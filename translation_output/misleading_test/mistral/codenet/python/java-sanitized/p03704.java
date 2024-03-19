import java.util.*;

public class p03704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < 21; i++) {
            sum += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(sum);
    }

    public static int f(int d, int x, int y) {
        int n = (x > 0) ? (int) (Math.pow(10, x) * Math.pow(10, y)) : 0;
        return (d == 0) ? (x < 1) ? 0 : sum(f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1)) for i in range(-9, 10) if Math.abs(d + i * n) < n) : 0;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}