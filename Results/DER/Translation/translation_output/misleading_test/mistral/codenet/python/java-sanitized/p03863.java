import java.util.Scanner;

public class p03863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) {
            System.out.println("First");
        } else if (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1) {
            System.out.println("Second");
        } else {
            System.out.println("Third");
        }
    }
}