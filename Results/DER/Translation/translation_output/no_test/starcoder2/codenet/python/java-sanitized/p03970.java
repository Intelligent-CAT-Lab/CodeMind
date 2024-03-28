import java.util.Scanner;

public class p03970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String A = "CODEFESTIVAL2016";
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != S.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}