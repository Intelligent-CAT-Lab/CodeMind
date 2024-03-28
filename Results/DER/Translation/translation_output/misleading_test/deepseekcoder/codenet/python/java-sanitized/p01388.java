import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int K = countChar(input, 'K');
        int U = countChar(input, 'U');
        int P = countChar(input, 'P');
        int C = countChar(input, 'C');
        System.out.println(Math.min(Math.min(Math.min(K, U), P), C));
    }

    private static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}