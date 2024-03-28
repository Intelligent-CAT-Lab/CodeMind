import java.util.Scanner;

public class p03729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        // Ensure there are exactly three words before proceeding
        if (parts.length == 3) {
            String a = parts[0];
            String b = parts[1];
            String c = parts[2];

            if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Input does not contain three words.");
        }

        scanner.close();
    }
}