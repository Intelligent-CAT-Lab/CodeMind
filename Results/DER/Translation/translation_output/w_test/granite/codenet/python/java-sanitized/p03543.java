import java.util.Scanner;

public class p03543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();

        char[] chars = N.toCharArray();
        if (chars[0] == chars[1] && chars[1] == chars[2] || chars[1] == chars[2] && chars[2] == chars[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}