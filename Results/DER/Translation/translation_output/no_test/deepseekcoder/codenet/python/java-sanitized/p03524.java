import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        Map<Character, Integer> sFrqDict = new HashMap<>();
        sFrqDict.put('a', 0);
        sFrqDict.put('b', 0);
        sFrqDict.put('c', 0);

        for (char s : S.toCharArray()) {
            sFrqDict.put(s, sFrqDict.get(s) + 1);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int frq : sFrqDict.values()) {
            if (frq != 0) {
                min = Math.min(min, frq);
                max = Math.max(max, frq);
            }
        }

        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}