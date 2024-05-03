import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p00018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Integer[] intNumbers = new Integer[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        
        Arrays.sort(intNumbers, Collections.reverseOrder());
        
        for (int number : intNumbers) {
            System.out.print(number + " ");
        }
    }
}