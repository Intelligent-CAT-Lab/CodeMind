import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String odd = "RUD";
        String even = "LUD";

        for (int i = 0; i < s.length(); i += 2) {
            if (odd.indexOf(s.charAt(i)) == -1) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (even.indexOf(s.charAt(j)) == -1) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
    }
}