import java.util.*;

public class p01989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c <= N; c++) {
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);

                    boolean ok = true;
                    if (A.matches(".*\\d.*")) {
                        int x = Integer.parseInt(A);
                        if (x > 255 || (x == 0 && A.length()!= 1)) {
                            ok = false;
                        }
                    } else if (A.length()!= 0) {
                        ok = false;
                    }

                    if (B.matches(".*\\d.*")) {
                        int x = Integer.parseInt(B);
                        if (x > 255 || (x == 0 && B.length()!= 1)) {
                            ok = false;
                        }
                    } else if (B.length()!= 0) {
                        ok = false;
                    }

                    if (C.matches(".*\\d.*")) {
                        int x = Integer.parseInt(C);
                        if (x > 255 || (x == 0 && C.length()!= 1)) {
                            ok = false;
                        }
                    } else if (C.length()!= 0) {
                        ok = false;
                    }

                    if (D.matches(".*\\d.*")) {
                        int x = Integer.parseInt(D);
                        if (x > 255 || (x == 0 && D.length()!= 1)) {
                            ok = false;
                        }
                    } else if (D.length()!= 0) {
                        ok = false;
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