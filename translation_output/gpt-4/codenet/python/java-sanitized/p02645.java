import java.util.Scanner;

public class p02645 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read the input from the user
        System.out.println(input.substring(0, Math.min(3, input.length()))); // Print the first three characters
        scanner.close();
    }
}