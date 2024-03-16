import java.util.Scanner;

public class p01479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = 0, c = 0, p = 0;
        char b = ' ';
        char r = ' ';
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 3 : 7;
            c += 1;
        }
        if (c > p) {
            r = b;
        }
        System.out.println((r == 'e') ? "egg" : "chicken");
    }
}