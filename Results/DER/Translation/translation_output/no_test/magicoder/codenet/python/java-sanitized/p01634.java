import java.util.Scanner;

public class p01634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        if (a.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (48 <= c && c <= 57) {
                    m += 1;
                }
                if (97 <= c && c <= 122) {
                    n += 1;
                }
                if (65 <= c && c <= 90) {
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