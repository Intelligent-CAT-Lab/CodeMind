import java.util.Arrays;
import java.util.Scanner;

public class p03671 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] abc = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            abc[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}