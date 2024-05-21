import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.indexOf('*');
        int p = Math.abs(countChar(s.substring(0, n), '(') - countChar(s.substring(0, n), ')'));
        int q = Math.abs(countChar(s.substring(n + 1), '(') - countChar(s.substring(n + 1), ')'));
        System.out.println(Math.min(p, q));
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