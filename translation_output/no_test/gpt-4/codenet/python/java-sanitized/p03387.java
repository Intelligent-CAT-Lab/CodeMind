import java.util.Scanner;

public class p03387 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Splitting the input line and converting to integers
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        // Finding max and min the conventional way as Java doesn't have built-in max/min for 3 values
        int x = Math.max(a, Math.max(b, c));
        int y = Math.min(a, Math.min(b, c));

        // Computing z based on the sum of a, b, and c minus x and y
        int z = a + b + c - x - y;

        // Checking the condition and printing the result
        if ((z - y) % 2 == 0) {
            System.out.println(x - z + (z - y) / 2);
        } else {
            System.out.println(x - z + 1 + (z - y + 1) / 2);
        }

        scanner.close();
    }
}