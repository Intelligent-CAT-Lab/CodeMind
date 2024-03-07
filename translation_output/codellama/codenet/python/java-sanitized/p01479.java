import java.util.Scanner;

public class p01479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0;
        int c = 0;
        int p = 0;
        char b = ' ';
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
            c++;
        }
        if (c > p) {
            r = b;
        }
        System.out.println(r == 'e' ? "chicken" : "egg");
    }
}