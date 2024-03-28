import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);
        int count = 0;
        for (int i = 0; i < sortedNumbers.length; i++) {
            if (sortedNumbers[i] == numbers[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}



import java.util.Scanner;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of input:");
        String input = scanner.nextLine();
        int[] numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = input.charAt(i) - '0';
        }
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);
        int count = 0;
        for (int i = 0; i < sortedNumbers.length; i++) {
            if (sortedNumbers[i] == numbers[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}