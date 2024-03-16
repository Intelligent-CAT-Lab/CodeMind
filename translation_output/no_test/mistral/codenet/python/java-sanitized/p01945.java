import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.indexOf('*');
        int P = Math.abs(S.substring(0, N).count("(") - S.substring(0, N).count(")"));
        int Q = Math.abs(S.substring(N + 1, S.length()).count("(") - S.substring(N + 1, S.length()).count(")"));
        System.out.println(Math.min(P, Q));
    }
}