import java.util.Scanner;

public class p04032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            System.exit(0);
        }

        for (int i = 0; i < S.length() - 2; i++) {
            String sub = S.substring(i, i + 3);
            if (hasAtMostTwoUniqueChars(sub)) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }

        System.out.println("-1 -1");
    }

    private static boolean hasAtMostTwoUniqueChars(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}