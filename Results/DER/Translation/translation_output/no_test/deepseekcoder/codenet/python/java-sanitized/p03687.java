import java.util.*;

public class p03687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char[] chars = S.toCharArray();

        List<Integer> o = new ArrayList<>();

        for (char a : new HashSet<>(Arrays.asList(chars))) {
            int j = 0;
            int m = 0;
            for (char b : chars) {
                if (a == b) {
                    j = 0;
                } else {
                    j += 1;
                    m = Math.max(m, j);
                }
            }
            o.add(m);
        }

        System.out.println(Collections.min(o));
    }
}