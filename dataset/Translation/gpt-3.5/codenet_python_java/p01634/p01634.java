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
                if (48 <= (int)a.charAt(i) && (int)a.charAt(i) <= 57) {
                    m++;
                }
                if (97 <= (int)a.charAt(i) && (int)a.charAt(i) <= 122) {
                    n++;
                }
                if (65 <= (int)a.charAt(i) && (int)a.charAt(i) <= 90) {
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