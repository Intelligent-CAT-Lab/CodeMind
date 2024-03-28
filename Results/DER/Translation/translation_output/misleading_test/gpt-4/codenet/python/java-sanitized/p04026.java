import java.util.Scanner;

public class p04026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Reads a string from the console

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println((i + 1) + " " + (i + 2));
                System.exit(0); // Exiting the program
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println((i + 1) + " " + (i + 3));
                System.exit(0); // Exiting the program
            }
        }
        System.out.println("-1 -1");
    }
}