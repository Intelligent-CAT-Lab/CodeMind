import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close(); // Close the scanner to avoid resource leaks

        char[] s = input.toCharArray();
        char[] t = new StringBuilder(input).reverse().toString().toCharArray();

        for (int i = 0; i < t.length; i++) {
            if (t[i] == 'p') {
                t[i] = 'q';
            } else if (t[i] == 'q') {
                t[i] = 'p';
            }
            if (t[i] == 'b') {
                t[i] = 'd';
            } else if (t[i] == 'd') {
                t[i] = 'b';
            }
        }

        boolean isEqual = true;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != t[i]) {
                isEqual = false;
                break;
            }
        }

        String ans = isEqual ? "Yes" : "No";
        System.out.println(ans);
    }
}