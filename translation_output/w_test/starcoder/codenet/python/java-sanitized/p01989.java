import java.util.*;

public class p01989 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int cnt = 0;
        for (int a = 1; a <= N - 2; a++) {
            for (int b = a + 1; b <= N - 1; b++) {
                for (int c = b + 1; c <= N; c++) {
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    if (A.equals("0") || B.equals("0") || C.equals("0") || D.equals("0")) {
                        continue;
                    }
                    if (A.length() > 1 && A.charAt(0) == '0') {
                        continue;
                    }
                    if (B.length() > 1 && B.charAt(0) == '0') {
                        continue;
                    }
                    if (C.length() > 1 && C.charAt(0) == '0') {
                        continue;
                    }
                    if (D.length() > 1 && D.charAt(0) == '0') {
                        continue;
                    }
                    if (Integer.parseInt(A) > 255 || Integer.parseInt(B) > 255 || Integer.parseInt(C) > 255 || Integer.parseInt(D) > 255) {
                        continue;
                    }
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}