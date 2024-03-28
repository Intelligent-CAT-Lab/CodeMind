import java.util.Scanner;
import java.util.Arrays;

public class p02778 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ni() {
            return scanner.nextInt();
        }

        int[] nm() {
            String[] parts = scanner.nextLine().split(" ");
            return Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        }

        int[] nl() {
            String[] parts = scanner.nextLine().split(" ");
            return Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        }

        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print('x');
        }
        scanner.close();
    }
}