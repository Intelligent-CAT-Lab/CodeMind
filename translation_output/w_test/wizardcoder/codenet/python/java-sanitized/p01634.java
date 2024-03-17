import java.util.Scanner;

public class p01634 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        if (password.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0, n = 0, l = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c >= '0' && c <= '9') {
                    m++;
                } else if (c >= 'a' && c <= 'z') {
                    n++;
                } else if (c >= 'A' && c <= 'Z') {
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