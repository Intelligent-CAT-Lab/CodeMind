import java.util.*;

public class p04032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            System.exit(0);
        }

        for (int i = 0; i < S.length() - 3; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < i + 3; j++) {
                set.add(S.charAt(j));
            }
            if (set.size() <= 2) {
                System.out.println(i + 1 + " " + (i + 3));
                break;
            }
        } else {
            System.out.println("-1 -1");
        }
    }
}