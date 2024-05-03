import java.util.Arrays;
import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        System.out.println(a + b + c - numbers[numbers.length - 1]);
    }
}