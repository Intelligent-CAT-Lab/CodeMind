import java.util.*;

public class p03241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MN = M/N;
        int[] divisor = makeDivisors(M);
        int max_gcd = 0;
        for (int i = 0; i < divisor.length; i++) {
            if (divisor[i] <= MN && divisor[i] >= max_gcd) {
                max_gcd = divisor[i];
            }
        }
        System.out.println(max_gcd);
    }

    public static int[] makeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i!= n / i) {
                    divisors.add(n / i);
                }
            }
        }
        int[] result = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }
        return result;
    }
}