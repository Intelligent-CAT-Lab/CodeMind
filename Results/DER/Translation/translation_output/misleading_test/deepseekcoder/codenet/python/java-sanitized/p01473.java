import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class p01473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int lS = S.length();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int dd = 0;
        for (int i : map.values()) {
            dd += i % 2;
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            long dnm = 1;
            for (int i : map.values()) {
                dnm *= factorial(i / 2);
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}