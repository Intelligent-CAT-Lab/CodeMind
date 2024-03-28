import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class p04032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            System.exit(0);
        }

        for (int i = 0; i < S.length() - 2; i++) {
            Set<Character> uniqueChars = new HashSet<>();
            for (int j = i; j < i + 3; j++) {
                uniqueChars.add(S.charAt(j));
            }
            if (uniqueChars.size() <= 2) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }

        System.out.println("-1 -1");
    }
}