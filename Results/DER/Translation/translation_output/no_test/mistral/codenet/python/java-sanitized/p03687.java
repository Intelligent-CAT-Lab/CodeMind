import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> C = new HashMap<>();
        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }
        int[] o = new int[C.size()];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < C.size(); i++) {
            int j = 0;
            int m = 0;
            for (char c : S.toCharArray()) {
                if (c == C.keySet().iterator().next()) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o[i] = m;
            min = Math.min(min, o[i]);
        }
        System.out.println(min);
    }
}