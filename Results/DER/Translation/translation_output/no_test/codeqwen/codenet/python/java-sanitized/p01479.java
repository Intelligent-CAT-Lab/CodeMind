import java.util.Scanner;

public class p01479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char b = ' ';
        int i = 0, c = 0, p = 0;
        String r = "";
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    r = String.valueOf(b);
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 3 : 7;
            c++;
        }
        if (c > p) {
            r = String.valueOf(b);
        }
        System.out.println((r.equals("e")) ? "chicken" : "egg");
    }
}