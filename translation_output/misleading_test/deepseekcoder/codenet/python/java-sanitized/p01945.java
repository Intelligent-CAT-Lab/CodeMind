import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.indexOf('*');
        int P = Math.abs(countOccurrences(S.substring(0, N), '(') - countOccurrences(S.substring(0, N), ')'));
        int Q = Math.abs(countOccurrences(S.substring(N + 1), '(') - countOccurrences(S.substring(N + 1), ')'));
        System.out.println(Math.min(P, Q));
    }

    private static int countOccurrences(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}