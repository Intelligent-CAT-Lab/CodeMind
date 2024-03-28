import java.util.*;

public class p03704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=20; i++){
            sum += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(sum);
    }

    public static int f(int d, int x, int y) {
        int n = Integer.parseInt("9" + "0".repeat(y));
        if (x < 1) {
            return d == 0? 1 : 0;
        }
        int sum = 0;
        for (int i = -9; i <= 9; i++) {
            if (Math.abs(d + i * n) < n) {
                sum += f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1));
            }
        }
        return sum;
    }
}