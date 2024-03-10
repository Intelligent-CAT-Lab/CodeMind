import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p01989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c < N; c++) {
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);

                    if (isValid(A) && isValid(B) && isValid(C) && isValid(D)) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }

    private static boolean isValid(String s) {
        int y = Integer.parseInt(s);
        if (y > 255) {
            return false;
        }
        if (y == 0 && s.length() != 1) {
            return false;
        }
        if (y != 0 && s.charAt(0) == '0') {
            return false;
        }
        return true;
    }
}