import java.util.*;

public class p01989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c < N; c++) {
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);

                    boolean ok = true;
                    if (A.length() > 0 &&!A.matches("[1-9]\\d*")) {
                        ok = false;
                    }
                    if (B.length() > 0 &&!B.matches("[1-9]\\d*")) {
                        ok = false;
                    }
                    if (C.length() > 0 &&!C.matches("[1-9]\\d*")) {
                        ok = false;
                    }
                    if (D.length() > 0 &&!D.matches("[1-9]\\d*")) {
                        ok = false;
                    }
                    if (A.length() > 0 && A.charAt(0) == '0') {
                        ok = false;
                    }
                    if (B.length() > 0 && B.charAt(0) == '0') {
                        ok = false;
                    }
                    if (C.length() > 0 && C.charAt(0) == '0') {
                        ok = false;
                    }
                    if (D.length() > 0 && D.charAt(0) == '0') {
                        ok = false;
                    }
                    if (A.length() > 0 && Integer.parseInt(A) > 255) {
                        ok = false;
                    }
                    if (B.length() > 0 && Integer.parseInt(B) > 255) {
                        ok = false;
                    }
                    if (C.length() > 0 && Integer.parseInt(C) > 255) {
                        ok = false;
                    }
                    if (D.length() > 0 && Integer.parseInt(D) > 255) {
                        ok = false;
                    }

                    cnt += ok;
                }
            }
        }

        System.out.println(cnt);
    }
}