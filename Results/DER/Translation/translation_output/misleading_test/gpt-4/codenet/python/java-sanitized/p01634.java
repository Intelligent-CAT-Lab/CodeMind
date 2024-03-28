import java.util.Scanner;

public class p01634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        scanner.close();

        if (a.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (c >= '0' && c <= '9') {
                    m++;
                }
                if (c >= 'a' && c <= 'z') {
                    n++;
                }
                if (c >= 'A' && c <= 'Z') {
                    l++;
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