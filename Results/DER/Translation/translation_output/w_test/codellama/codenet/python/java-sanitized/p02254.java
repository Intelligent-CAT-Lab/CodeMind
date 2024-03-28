import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class p02254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> dictString = new HashMap<>();
        Map<Character, Integer> dictDepth = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (dictString.containsKey(c)) {
                dictString.put(c, dictString.get(c) + 1);
            } else {
                dictString.put(c, 1);
                dictDepth.put(c, 0);
            }
        }

        Map<Character, Integer> dictStringCalc = new HashMap<>(dictString);

        while (dictStringCalc.size() != 1) {
            Character x = null;
            Character y = null;

            for (Map.Entry<Character, Integer> entry : dictStringCalc.entrySet()) {
                if (x == null) {
                    x = entry.getKey();
                    int xCnt = entry.getValue();
                    continue;
                }

                if (y == null) {
                    y = entry.getKey();
                    int yCnt = entry.getValue();
                    break;
                }
            }

            for (int i = 0; i < x.length(); i++) {
                char c = x.charAt(i);
                if (dictDepth.containsKey(c)) {
                    dictDepth.put(c, dictDepth.get(c) + 1);
                } else {
                    throw new IllegalArgumentException("Invalid input");
                }
            }

            for (int i = 0; i < y.length(); i++) {
                char c = y.charAt(i);
                if (dictDepth.containsKey(c)) {
                    dictDepth.put(c, dictDepth.get(c) + 1);
                } else {
                    throw new IllegalArgumentException("Invalid input");
                }
            }

            dictStringCalc.remove(x);
            dictStringCalc.remove(y);
            dictStringCalc.put(x + y, xCnt + yCnt);
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> entry : dictDepth.entrySet()) {
            ans += dictString.get(entry.getKey()) * entry.getValue();
        }

        if (dictString.size() == 1) {
            ans = input.length();
        }

        System.out.println(ans);
    }
}