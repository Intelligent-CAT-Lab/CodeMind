import java.util.HashMap;
import java.util.Map;

public class p03687 {
    public static void main(String[] args) {
        String S = System.console().readLine();
        Map<Character, Integer> C = new HashMap<>();

        for (char a : S.toCharArray()) {
            C.put(a, C.getOrDefault(a, 0) + 1);
        }

        int[] o = new int[C.size()];
        int i = 0;

        for (char a : C.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S.toCharArray()) {
                if (a == b) {
                    j = 0;
                } else {
                    j += 1;
                    m = Math.max(m, j);
                }
            }
            o[i++] = m;
        }

        int min = Integer.MAX_VALUE;
        for (int num : o) {
            min = Math.min(min, num);
        }

        System.out.println(min);
    }
}