import java.util.Scanner;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        int maxCount = 0;
        int maxLength = 0;
        for (String word : words) {
            int count = 0;
            for (String word2 : words) {
                if (word.equals(word2)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxLength = word.length();
            } else if (count == maxCount && word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        System.out.println(maxCount + " " + maxLength);
    }
}