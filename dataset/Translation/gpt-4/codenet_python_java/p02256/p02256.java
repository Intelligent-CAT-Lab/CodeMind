import java.util.Scanner;

public class p02256 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split("\\s+");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        // Swapping if x is greater than y
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        // Calculating GCD
        while (x % y != 0) {
            int tempX = y;
            int tempY = x % y;
            x = tempX;
            y = tempY;
        }

        // Output the GCD
        System.out.println(y);

        scanner.close();
    }
}