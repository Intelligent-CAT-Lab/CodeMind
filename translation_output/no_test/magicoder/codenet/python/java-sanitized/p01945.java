import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int N = S.indexOf('*');
        int P = Math.abs(countChar(S.substring(0, N), '(') - countChar(S.substring(0, N), ')'));
        int Q = Math.abs(countChar(S.substring(N + 1), '(') - countChar(S.substring(N + 1), ')'));
        System.out.println(Math.min(P, Q));
    }

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}