import java.util.Scanner;

public class p03241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        double MN = (double)M/N;
        int[] divisor = make_divisors(M);
        int max_gcd = 0;
        for (int d : divisor) {
            if (d<=MN && d>=max_gcd) {
                max_gcd = d;
            }
        }
        System.out.println(max_gcd);
    }

    public static int[] make_divisors(int n) {
        int[] divisors = new int[n];
        int i = 0;
        for (int j=1; j<=Math.sqrt(n); j++) {
            if (n%j==0) {
                divisors[i] = j;
                i++;
                if (j != n/j) {
                    divisors[i] = n/j;
                    i++;
                }
            }
        }
        return divisors;
    }
}