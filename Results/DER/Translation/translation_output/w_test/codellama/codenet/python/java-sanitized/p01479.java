import java.util.Scanner;

public class p01479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 0;
        int c = 0;
        int p = 0;
        char b = ' ';
        char r = ' ';
        while (i < input.length()) {
            if (input.charAt(i) == b) {
                if (c > p) {
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = input.charAt(i);
            i += (b == 'c') ? 3 : 7;
            c++;
        }
        if (c > p) {
            r = b;
        }
        System.out.println(r == 'e' ? "egg" : "chicken");
    }
}