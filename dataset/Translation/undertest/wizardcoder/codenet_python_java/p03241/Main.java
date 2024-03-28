import java.util.*;

public class p03241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MN = M/N;
        List<Integer> divisor = makeDivisors(M);
        int max_gcd = 0;
        for (int d : divisor) {
            if (d<=MN && d>=max_gcd) {
                max_gcd = d;
            }
        }
        System.out.println(max_gcd);
    }

    public static List<Integer> makeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i!= n / i) {
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }
}