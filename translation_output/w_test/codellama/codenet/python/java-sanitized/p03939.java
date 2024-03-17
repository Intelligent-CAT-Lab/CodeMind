import java.util.Scanner;

public class p03939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d += (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        System.out.println(ret);
    }
}