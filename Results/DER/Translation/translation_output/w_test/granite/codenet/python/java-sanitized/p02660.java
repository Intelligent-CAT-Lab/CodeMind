import java.util.*;

public class p02660 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> factors = primeFactorize(n);
        if (factors.size() == 1) {
            System.out.println(1);
        } else {
            int count = 0;
            Integer currentFactor = null;
            int power = 0;
            Set<Integer> powers = new HashSet<>();
            for (int factor : factors) {
                if (currentFactor == null || currentFactor.equals(factor)) {
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
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                factors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n!= 1) {
            factors.add(n);
        }
        return factors;
    }
}