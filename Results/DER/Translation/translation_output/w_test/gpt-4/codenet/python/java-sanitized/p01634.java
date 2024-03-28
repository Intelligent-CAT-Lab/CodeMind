import java.util.Scanner;

public class p01634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:");
        String a = scanner.nextLine();

        if (a.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0; // Digit count
            int n = 0; // Lowercase letter count
            int l = 0; // Uppercase letter count
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
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
        scanner.close();
    }
}