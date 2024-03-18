import java.util.Scanner;

public class p02640 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if ((2 * a + 4 * b) == y) {
                count = 1;
                break;
            }
            // no need for else part, Java does not need pass as in Python
        }

        System.out.println(count == 1 ? "Yes" : "No");
    }
}