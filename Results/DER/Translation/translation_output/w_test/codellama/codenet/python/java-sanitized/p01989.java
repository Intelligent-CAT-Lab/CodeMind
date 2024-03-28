import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p01989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = input.length();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c < N; c++) {
                    String A = input.substring(0, a);
                    String B = input.substring(a, b);
                    String C = input.substring(b, c);
                    String D = input.substring(c);

                    if (isValid(A) && isValid(B) && isValid(C) && isValid(D)) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }

    private static boolean isValid(String s) {
        int num = Integer.parseInt(s);
        if (num > 255) {
            return false;
        }
        if (num == 0 && s.length() != 1) {
            return false;
        }
        if (num != 0 && s.charAt(0) == '0') {
            return false;
        }
        return true;
    }
}