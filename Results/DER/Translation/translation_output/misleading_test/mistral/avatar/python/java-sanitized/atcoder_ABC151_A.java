import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char output = (char) (ord(input.charAt(0)) + 1);
        System.out.println(output);
    }
}