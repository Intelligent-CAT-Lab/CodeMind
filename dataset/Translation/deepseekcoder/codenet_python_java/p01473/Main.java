import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.math.BigInteger;

public class p01473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int lS = S.length();
        ArrayList<Integer> d = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for (char c : S.toCharArray()) {
            set.add(c);
        }
        for (char c : set) {
            d.add(countChar(S, c));
        }
        int dd = (int) d.stream().filter(i -> i % 2 != 0).count();
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int i : d) {
                dnm = dnm.multiply(factorial(i / 2));
            }
            System.out.println(factorial(lS / 2).divide(dnm));
        }
    }

    private static int countChar(String s, char c) {
        return (int) s.chars().filter(ch -> ch == c).count();
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}