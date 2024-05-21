import java.util.HashSet;
import java.util.Set;

public class p04032 {
    public static void main(String[] args) {
        String S = System.console().readLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println(1 + " " + 2);
            } else {
                System.out.println(-1 + " " + -1);
            }
            return;
        }

        for (int i = 0; i < S.length() - 3; i++) {
            String s = S.substring(i, i + 3);
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            if (set.size() <= 2) {
                System.out.println(i + 1 + " " + i + 3);
                return;
            }
        }
        System.out.println(-1 + " " + -1);
    }
}