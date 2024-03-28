import java.util.Scanner;

public class p02660 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] factors = primeFactorize(n);
        int count = 0;
        int currentFactor = 0;
        int power = 0;
        Set<Integer> powers = new HashSet<>();
        for (int factor : factors) {
            if (currentFactor == factor) {
                power++;
                if (!powers.contains(power)) {
                    powers.add(power);
                    power = 0;
                    count++;
                }
            } else {
                powers.clear();
                power = 0;
                powers.add(1);
                count++;
                currentFactor = factor;
            }
        }
        System.out.println(count);
    }

    private static int[] primeFactorize(int n) {
        int[] factors = new int[n];
        int i = 0;
        while (n % 2 == 0) {
            factors[i++] = 2;
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                factors[i++] = f;
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            factors[i++] = n;
        }
        return factors;
    }
}