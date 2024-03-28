import java.util.Scanner;

public class p03543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        char[] digits = N.toCharArray();

        if (digits[0] == digits[1] && digits[1] == digits[2]) {
            System.out.println("Yes");
        } else if (digits[1] == digits[2] && digits[2] == digits[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}