import java.util.*;

public class p03687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<Character, Integer> C = new HashMap<>();
        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }
        List<Integer> o = new ArrayList<>();
        for (char a : C.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S.toCharArray()) {
                if (a == b) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o.add(m);
        }
        System.out.println(Collections.min(o));
    }
}