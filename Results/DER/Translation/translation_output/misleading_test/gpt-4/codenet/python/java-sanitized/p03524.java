import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class p03524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        HashMap<Character, Integer> sFrqMap = new HashMap<>();
        sFrqMap.put('a', 0);
        sFrqMap.put('b', 0);
        sFrqMap.put('c', 0);

        for (char s : S.toCharArray()) {
            sFrqMap.put(s, sFrqMap.get(s) + 1);
        }

        int maxFreq = Collections.max(sFrqMap.values());
        int minFreq = Collections.min(sFrqMap.values());

        if (maxFreq - minFreq <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}