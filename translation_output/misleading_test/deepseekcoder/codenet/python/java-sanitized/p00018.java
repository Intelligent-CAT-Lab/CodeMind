import java.util.Arrays;
import java.util.Collections;

public class p00018 {
    public static void main(String[] args) {
        String[] input = "3 6 9 7 5".split(" ");
        Integer[] numbers = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}