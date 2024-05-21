import java.util.Scanner;

public class p01634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.length() < 6) {
            System.out.println("INVALID");
        } else {
            int lowerCaseCount = 0;
            int upperCaseCount = 0;
            int digitCount = 0;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isLowerCase(c)) {
                    lowerCaseCount++;
                } else if (Character.isUpperCase(c)) {
                    upperCaseCount++;
                } else if (Character.isDigit(c)) {
                    digitCount++;
                }
            }

            if (lowerCaseCount == 0 || upperCaseCount == 0 || digitCount == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
    }
}