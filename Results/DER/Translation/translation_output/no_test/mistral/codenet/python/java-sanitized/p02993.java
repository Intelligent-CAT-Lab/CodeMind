import java.util.Scanner;

public class p02993 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = f(s);
        System.out.println(result);
    }

    public static String f(String s) {
        for (int i = 0; i < s.length(); i++) {
            char u = s.charAt(i);
            char v = s.charAt(i + 1);
            if (u == v) {
                return "Bad";
            }
        }
        return "Good";
    }
}