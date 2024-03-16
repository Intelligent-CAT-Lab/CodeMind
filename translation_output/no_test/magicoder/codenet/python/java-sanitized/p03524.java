import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        Map<Character, Integer> sFrqDict = new HashMap<>();
        sFrqDict.put('a', 0);
        sFrqDict.put('b', 0);
        sFrqDict.put('c', 0);

        for (char s : S.toCharArray()) {
            sFrqDict.put(s, sFrqDict.get(s) + 1);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int frq : sFrqDict.values()) {
            if (frq > max) {
                max = frq;
            }
            if (frq < min) {
                min = frq;
            }
        }

        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}