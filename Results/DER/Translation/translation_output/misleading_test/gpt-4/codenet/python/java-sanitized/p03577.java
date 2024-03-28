import java.util.Scanner;

public class p03577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.length() > 8) {
            System.out.println(input.substring(0, input.length() - 8));
        } else {
            // In Python, slicing off more characters than the string has returns an empty string
            // To mimic this behavior, we print an empty string if the input is less than 8 characters
            System.out.println();
        }
        scanner.close();
    }
}