import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;

public class p01473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < lS; i++) {
            set.add(S.charAt(i));
        }
        List<Integer> d = new ArrayList<>();
        for (Character c : set) {
            int count = 0;
            for (int i = 0; i < lS; i++) {
                if (S.charAt(i) == c) {
                    count++;
                }
            }
            d.add(count);
        }
        int dd = 0;
        for (int i = 0; i < d.size(); i++) {
            if (d.get(i) % 2 == 1) {
                dd++;
            }
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            int dnm = 1;
            for (int i = 0; i < d.size(); i++) {
                dnm *= factorial(d.get(i) / 2);
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}