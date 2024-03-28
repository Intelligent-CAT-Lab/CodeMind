import java.util.Scanner;

public class p01634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.length() < 6) {
            System.out.println("INVALID");
        } else {
            int numCount = 0;
            int lowerCount = 0;
            int upperCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c >= '0' && c <= '9') {
                    numCount++;
                } else if (c >= 'a' && c <= 'z') {
                    lowerCount++;
                } else if (c >= 'A' && c <= 'Z') {
                    upperCount++;
                }
            }
            if (numCount == 0 || lowerCount == 0 || upperCount == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
    }
}