import java.util.Scanner;

public class p02987 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next(); // assume input is a single word with at least 4 characters

        if (input.length() == 4) {
            char a = input.charAt(0);
            char b = input.charAt(1);
            char c = input.charAt(2);
            char d = input.charAt(3);
            
            int flag = 0;
            if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
                flag = 1;
            }
            if (a == b && a == c && a == d) {
                flag = 0;
            }
            if (flag == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("Invalid input length. Input must have exactly 4 characters.");
        }
        scanner.close();
    }
}