import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == 'W' && input.charAt(i + 1) == 'B') ||
                (input.charAt(i) == 'B' && input.charAt(i + 1) == 'W')) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}