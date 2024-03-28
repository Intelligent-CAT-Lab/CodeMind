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
                    boolean ok = true;
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    List<String> parts = new ArrayList<>();
                    parts.add(A);
                    parts.add(B);
                    parts.add(C);
                    parts.add(D);

                    for (String part : parts) {
                        int y = Integer.parseInt(part);
                        if (y > 255) {
                            ok = false;
                        }
                        if (y == 0 && part.length() != 1) {
                            ok = false;
                        }
                        if (y != 0 && part.charAt(0) == '0') {
                            ok = false;
                        }
                    }
                    if (ok) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}