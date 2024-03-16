import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class p03524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        HashMap<Character, Integer> sFrqDict = new HashMap<Character, Integer>() {{
            put('a', 0);
            put('b', 0);
            put('c', 0);
        }};

        for (char s : S.toCharArray()) {
            sFrqDict.put(s, sFrqDict.getOrDefault(s, 0) + 1);
        }

        int maxFrq = Collections.max(sFrqDict.values());
        int minFrq = Collections.min(sFrqDict.values());

        if (maxFrq - minFrq <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}