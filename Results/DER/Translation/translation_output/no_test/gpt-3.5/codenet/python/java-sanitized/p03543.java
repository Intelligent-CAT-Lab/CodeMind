import java.util.Scanner;

public class p03543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();

        char a = N.charAt(0);
        char b = N.charAt(1);
        char c = N.charAt(2);
        char d = N.charAt(3);

        if ((a == b && b == c) || (b == c && c == d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}