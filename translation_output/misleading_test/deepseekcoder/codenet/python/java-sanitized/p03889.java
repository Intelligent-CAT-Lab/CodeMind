import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = new StringBuilder(s).reverse().toString();
        char[] chars = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'p') {
                chars[i] = 'q';
            } else if (chars[i] == 'q') {
                chars[i] = 'p';
            }
            if (chars[i] == 'b') {
                chars[i] = 'd';
            } else if (chars[i] == 'd') {
                chars[i] = 'b';
            }
        }
        String ans = new String(chars);
        if (s.equals(ans)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}