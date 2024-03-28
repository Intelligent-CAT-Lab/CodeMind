import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char character = input.charAt(0);
        char nextChar = (char) (character + 1);
        System.out.println(nextChar);
        scanner.close();
    }
}