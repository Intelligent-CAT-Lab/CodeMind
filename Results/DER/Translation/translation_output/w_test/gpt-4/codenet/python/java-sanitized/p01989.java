import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class p01989 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c < N; c++) {
                    boolean ok = true;
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    String[] parts = {A, B, C, D};
                    for (String x : parts) {
                        int y;
                        try {
                            y = Integer.parseInt(x);
                        } catch (NumberFormatException e) {
                            ok = false;
                            break;
                        }
                        if (y > 255) {
                            ok = false;
                        }
                        if (y == 0 && x.length() != 1) {
                            ok = false;
                        }
                        if (y != 0 && x.charAt(0) == '0') {
                            ok = false;
                        }
                    }
                    cnt += ok ? 1 : 0;
                }
            }
        }

        System.out.println(cnt);
        input.close();
    }
}