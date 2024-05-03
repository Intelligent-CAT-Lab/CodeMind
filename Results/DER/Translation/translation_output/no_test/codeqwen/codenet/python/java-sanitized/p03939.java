import java.util.Scanner;

public class p03939 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double d = scanner.nextDouble();
        double x = scanner.nextDouble();
        System.out.println(main(N, d, x));
    }

    public static double main(int N, double d, double x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N-0.5) * x;
            d = d + (d/N) + (5*x)/(2*N);
            x += 2*x/N;
            N -= 1;
        }
        return ret;
    }
}