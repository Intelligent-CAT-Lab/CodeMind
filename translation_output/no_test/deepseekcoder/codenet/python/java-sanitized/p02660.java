import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p02660 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> res = primeFactorize(n);
        if (res.size() == 1) {
            System.out.println(1);
        } else {
            System.out.println(countGroups(res));
        }
    }

    private static ArrayList<Integer> primeFactorize(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
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
        if (n != 1) {
            factors.add(n);
        }
        return factors;
    }

    private static int countGroups(ArrayList<Integer> factors) {
        int count = 0;
        Integer current = null;
        int groupSize = 0;
        Set<Integer> groupSizes = new HashSet<>();
        for (Integer factor : factors) {
            if (current == factor) {
                groupSize++;
                if (!groupSizes.contains(groupSize)) {
                    groupSizes.add(groupSize);
                    groupSize = 0;
                    count++;
                }
            } else {
                groupSizes.clear();
                groupSizes.add(1);
                count++;
                current = factor;
            }
        }
        return count;
    }
}