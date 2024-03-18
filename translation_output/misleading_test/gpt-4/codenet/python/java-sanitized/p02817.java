import java.util.Scanner;

public class p02817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input in the same line and split them into two parts
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        // Assigning each part to specific string variables
        String S = parts[0];
        String T = parts[1];

        // Concatenating and printing as per the expected output
        System.out.println(T + "!" + S);

        scanner.close();
    }
}