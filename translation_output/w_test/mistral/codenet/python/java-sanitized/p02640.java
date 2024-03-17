import java.util.Scanner;

public class p02640 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        int count = 0;
        for (int a = 1; a <= x; a++) {
            int b = x - a;
            if (2 * a + 4 * b == y) {
                count = 1;
                break;
            }
        }
        System.out.println("Yes" + (count == 1 ? "" : " No"));
    }
}