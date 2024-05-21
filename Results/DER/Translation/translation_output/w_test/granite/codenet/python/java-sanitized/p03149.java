import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);
        int[] expected = {1, 4, 7, 9};
        boolean isEqual = true;
        for (int i = 0; i < expected.length; i++) {
            if (numbers[i]!= expected[i]) {
                isEqual = false;
                break;
            }
        }
        String answer = isEqual? "YES" : "NO";
        System.out.println(answer);
    }
}