import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countWBAndBW(input));
        scanner.close();
    }

    private static int countWBAndBW(String input) {
        int count = 0;
        count += countOccurrences(input, "WB");
        count += countOccurrences(input, "BW");
        return count;
    }

    private static int countOccurrences(String haystack, String needle) {
        int count = 0;
        int index = 0;
        while ((index = haystack.indexOf(needle, index)) != -1) {
            count++;
            index += needle.length();
        }
        return count;
    }
}