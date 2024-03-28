import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class p02675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        scanner.close();

        List<Integer> honNumbers = Arrays.asList(2, 4, 5, 7, 9);

        if (n == 3) {
            System.out.println("bon");
        } else if (honNumbers.contains(n)) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}