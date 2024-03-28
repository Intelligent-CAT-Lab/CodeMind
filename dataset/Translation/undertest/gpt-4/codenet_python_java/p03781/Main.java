import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong(); // Assumed input to be of type long for larger numbers.
        long result;

        double sqrtVal = Math.sqrt(8 * x + 1);
        if (sqrtVal == Math.floor(sqrtVal)) {
            result = (long) ((-1 + sqrtVal) / 2);
            System.out.println(result);
        } else {
            result = (long) ((-1 + sqrtVal) / 2);
            System.out.println(result + 1);
        }

        scanner.close();
    }
}