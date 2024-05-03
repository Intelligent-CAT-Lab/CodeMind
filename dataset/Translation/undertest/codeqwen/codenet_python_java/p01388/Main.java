import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int K = countChar(a, 'K');
        int U = countChar(a, 'U');
        int P = countChar(a, 'P');
        int C = countChar(a, 'C');
        System.out.println(Math.min(K, Math.min(U, Math.min(P, C))));
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}