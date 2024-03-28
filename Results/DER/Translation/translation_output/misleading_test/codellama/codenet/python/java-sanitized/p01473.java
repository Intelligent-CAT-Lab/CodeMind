import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class p01473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lS = input.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < lS; i++) {
            set.add(input.charAt(i));
        }
        int[] d = new int[set.size()];
        int dd = 0;
        int i = 0;
        for (Character c : set) {
            d[i] = input.length() - input.replace(c.toString(), "").length();
            if (d[i] % 2 == 1) {
                dd++;
            }
            i++;
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            int dnm = 1;
            for (int j = 0; j < d.length; j++) {
                dnm *= factorial(d[j] / 2);
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