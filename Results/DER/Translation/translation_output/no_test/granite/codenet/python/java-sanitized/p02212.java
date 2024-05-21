import java.util.Arrays;
import java.util.Scanner;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);
        int result = Math.abs((numbers[0] + numbers[3]) - (numbers[1] + numbers[2]));
        System.out.println(result);
    }
}