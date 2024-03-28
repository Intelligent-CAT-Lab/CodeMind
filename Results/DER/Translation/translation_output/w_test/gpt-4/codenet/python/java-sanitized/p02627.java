import java.util.Scanner;

public class p02627 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (input.length() == 1) {
            char n = input.charAt(0);
            
            if (Character.isUpperCase(n)) {
                System.out.println("A");
            } else if (Character.isLowerCase(n)) {
                System.out.println("a");
            }
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}