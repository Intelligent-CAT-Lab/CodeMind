import java.util.*;

public class p03687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> C = new HashMap<>();

        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }

        List<Integer> o = new ArrayList<>();

        for (char a : C.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S.toCharArray()) {
                if (a != b) {
                    j += 1;
                    m = Math.max(m, j);
                } else {
                    j = 0;
                }
            }
            o.add(m);
        }

        o.sort(Integer::compareTo);
        System.out.println(o.get(0));
    }
}