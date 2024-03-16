import java.util.Scanner;

public class p01479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0, c = 0, p = 0;
        char b = ' ';
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 7 : 3;
            c += 1;
        }
        if (c > p) {
            p = c;
        }
        System.out.println((b == 'e') ? "egg" : "chicken");
    }
}