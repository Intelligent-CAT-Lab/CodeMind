import java.util.Scanner;

public class p01521 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        System.out.println((firstChar == 'x' && lastChar == 'x') ? 'x' : 'o');

        scanner.close();
    }
}