import java.util.Scanner;

public class p03241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        double MN = (double)M/N;
        int max_gcd = 0;
        for (int i = 1; i <= Math.sqrt(M); i++) {
            if (M % i == 0) {
                if (i <= MN && i >= max_gcd) {
                    max_gcd = i;
                }
                if (i != M/i && M/i <= MN && M/i >= max_gcd) {
                    max_gcd = M/i;
                }
            }
        }
        System.out.println(max_gcd);
    }
}