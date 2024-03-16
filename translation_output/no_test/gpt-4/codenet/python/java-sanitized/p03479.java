import java.util.Scanner;

public class p03479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong(); // instead of 'a' in the Python code
        long b = scanner.nextLong(); // instead of 'b' in the Python code
        int count = 1;
        long x = a;

        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }

        System.out.println(count);

        scanner.close();
    }
}