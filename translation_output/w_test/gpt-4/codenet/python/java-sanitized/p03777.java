import java.util.Scanner;

public class p03777 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming the input will be in the format "H H" without quotes
        String a = scanner.next();
        String b = scanner.next();

        // Closing the scanner as good practice since we don't need it anymore
        scanner.close();

        if (a.equals("H")) {
            System.out.println(b);
        } else {
            if (b.equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}