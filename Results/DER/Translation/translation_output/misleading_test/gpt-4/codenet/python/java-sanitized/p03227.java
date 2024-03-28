import java.util.Scanner;

public class p03227 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        if(input.length() == 2) {
            System.out.println(input);
        } else {
            StringBuilder reversed = new StringBuilder(input).reverse();
            System.out.println(reversed.toString());
        }

        scanner.close();
    }
}