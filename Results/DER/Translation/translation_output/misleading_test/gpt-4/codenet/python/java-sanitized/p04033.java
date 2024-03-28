import java.util.Scanner;

public class p04033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (b < 0) {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        } else if (a > 0) {
            System.out.println("Positive");
        }
        
        scanner.close();
    }
}