import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String sortedInput = sortString(input);
        int[] counts = getCounts(sortedInput);
        int result = getResult(counts);
        System.out.println(result);
    }

    private static String sortString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static int[] getCounts(String sortedInput) {
        int[] counts = new int[26];
        for (int i = 0; i < sortedInput.length(); i++) {
            char c = sortedInput.charAt(i);
            counts[c - 'a']++;
        }
        return counts;
    }

    private static int getResult(int[] counts) {
        int result = 0;
        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            result += count * (count - 1) / 2;
        }
        return result;
    }
}