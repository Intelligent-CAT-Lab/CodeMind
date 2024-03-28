import java.util.Scanner;

public class p02993 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() < 2) {
            System.out.println("Bad");
        } else {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    System.out.println("Bad");
                    break;
                }
            }
            System.out.println("Good");
        }
    }
}