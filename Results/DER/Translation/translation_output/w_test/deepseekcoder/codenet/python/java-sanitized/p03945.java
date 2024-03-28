import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = countOccurrences(input, "WB") + countOccurrences(input, "BW");
        System.out.println(count);
    }

    public static int countOccurrences(String str, String sub) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(sub, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += sub.length();
            }
        }

        return count;
    }
}