import java.util.Scanner;

public class p03227 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() == 2) {
            System.out.println(input);
        } else {
            System.out.println(new StringBuilder(input).reverse());
        }
    }
}