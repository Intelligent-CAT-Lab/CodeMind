import java.util.Scanner;

public class p02993 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() < 2) {
            System.out.println("Bad");
            return;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}