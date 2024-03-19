import java.util.Scanner;

public class p01634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();

        if (password.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    m += 1;
                }
                if (ch >= 'a' && ch <= 'z') {
                    n += 1;
                }
                if (ch >= 'A' && ch <= 'Z') {
                    l += 1;
                }
            }
            if (m == 0 || n == 0 || l == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
    }
}