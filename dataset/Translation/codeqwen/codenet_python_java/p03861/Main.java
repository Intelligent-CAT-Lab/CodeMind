import java.util.Arrays;
import java.util.Scanner;

public class p03861 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        int result = (b / x) - ((a - 1) / x);

        System.out.println(result);
    }
}