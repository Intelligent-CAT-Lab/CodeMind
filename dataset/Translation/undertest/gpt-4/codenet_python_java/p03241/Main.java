import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03241 {

    private static List<Integer> makeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();
        
        double MN = (double) M / N;
        List<Integer> divisors = makeDivisors(M);
        int maxGcd = 0;
        for (Integer divisor : divisors) {
            if (divisor <= MN && divisor >= maxGcd) {
                maxGcd = divisor;
            }
        }
        System.out.println(maxGcd);
    }
}