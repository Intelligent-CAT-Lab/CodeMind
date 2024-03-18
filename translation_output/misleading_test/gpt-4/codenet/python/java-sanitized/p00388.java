import java.util.Scanner;

public class p00388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt(); // Get value for height
        int a = scanner.nextInt(); // Get value for climb up
        int b = scanner.nextInt(); // Get value for climb down
        scanner.close();

        System.out.println(countPossibleDays(h, a, b));
    }

    private static int countPossibleDays(int h, int a, int b) {
        int count = 0;
        for (int c = b - a; c >= 0; --c) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        return count;
    }
}