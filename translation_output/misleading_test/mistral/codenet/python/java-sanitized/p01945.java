import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String S = input;
        int N = S.indexOf('*');
        int P = Math.abs(S.substring(0, N).replaceAll("\\(", "").replaceAll(")", "").length() - S.substring(0, N).replaceAll(")", "").length());
        int Q = Math.abs(S.substring(N + 1, S.length()).replaceAll("\\(", "").replaceAll(")", "").length() - S.substring(N + 1, S.length()).replaceAll(")", "").length());
        System.out.println(Math.min(P, Q));
    }
}