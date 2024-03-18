import java.util.Scanner;

public class p03327 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1000) {
            System.out.print("ABC");
        } else {
            System.out.print("ABD"); // In Java, println would add a newline. Using print to match the Python output.
        }
        scanner.close();
    }
}