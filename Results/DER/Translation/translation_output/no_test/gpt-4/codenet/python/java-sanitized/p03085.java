import java.util.Scanner;

public class p03085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a base (A, C, G, or T): ");
        String b = scanner.nextLine();

        if ("A".equals(b)) {
            System.out.println("T");
        } else if ("C".equals(b)) {
            System.out.println("G");
        } else if ("G".equals(b)) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }

        scanner.close();
    }
}