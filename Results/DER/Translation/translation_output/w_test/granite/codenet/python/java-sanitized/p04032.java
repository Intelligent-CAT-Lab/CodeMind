import java.util.Scanner;

public class p04032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("2 5");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }

        for (int i = 0; i < S.length() - 3; i++) {
            String s = S.substring(i, i + 3);
            if (s.chars().distinct().count() <= 2) {
                System.out.println((i + 1) + " " + (i + 3));
                break;
            }
        }
        System.out.println("-1 -1");
    }
}