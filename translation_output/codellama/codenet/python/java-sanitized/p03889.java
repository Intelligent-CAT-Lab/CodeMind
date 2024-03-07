import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversedInput = new StringBuilder(input).reverse().toString();
        for (int i = 0; i < reversedInput.length(); i++) {
            if (reversedInput.charAt(i) == 'p') {
                reversedInput = reversedInput.replace(i, i + 1, "q");
            } else if (reversedInput.charAt(i) == 'q') {
                reversedInput = reversedInput.replace(i, i + 1, "p");
            } else if (reversedInput.charAt(i) == 'b') {
                reversedInput = reversedInput.replace(i, i + 1, "d");
            } else if (reversedInput.charAt(i) == 'd') {
                reversedInput = reversedInput.replace(i, i + 1, "b");
            }
        }
        if (input.equals(reversedInput)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}