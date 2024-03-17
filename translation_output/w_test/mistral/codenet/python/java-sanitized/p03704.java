import java.util.*;

public class p03704 {
    public static int f(int d, int x, int y) {
        int n = (x * 9 + y) / 10;
        return (d == 0) ? (x < 1) : (sum(f(d + i * n, x - 2, y + 1) * (10 - abs(i) - (y < 1)) for i in range(-9, 10) if abs(d + i * n) < n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        System.out.println(sum(f(D, i, 0) * (10 - i % 2 * 9) for i in range(1, 21)));
    }
}