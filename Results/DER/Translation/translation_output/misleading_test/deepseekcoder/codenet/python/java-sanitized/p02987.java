import java.util.Scanner;

public class p02987 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);
        boolean flag = false;
        if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
            flag = true;
        }
        if (a == b && a == c && a == d) {
            flag = false;
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}