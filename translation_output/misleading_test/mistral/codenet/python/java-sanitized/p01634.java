import java.util.Scanner;

public class p01634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < input.length(); i++) {
                if (48 <= input.charAt(i) && input.charAt(i) <= 57) {
                    m++;
                }
                if (97 <= input.charAt(i) && input.charAt(i) <= 122) {
                    n++;
                }
                if (65 <= input.charAt(i) && input.charAt(i) <= 90) {
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