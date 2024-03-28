import java.util.Scanner;

public class p03469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date:");
        String input = scanner.nextLine(); // Read the input date from the user
        String formattedDate = "2018" + input.substring(4); // Replace the year part and keep the rest of the date unchanged
        System.out.println(formattedDate); // Print the formatted date
        scanner.close(); // Close the scanner
    }
}