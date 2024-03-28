import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'p') {
                t.charAt(i) = 'q';
            } else if (t.charAt(i) == 'q') {
                t.charAt(i) = 'p';
            } else if (t.charAt(i) == 'b') {
                t.charAt(i) = 'd';
            } else if (t.charAt(i) == 'd') {
                t.charAt(i) = 'b';
            }
        }
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}