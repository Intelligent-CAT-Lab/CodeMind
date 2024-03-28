import java.util.Scanner;

public class p02417 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        int[] counts = new int[26];

        for (String word : words) {
            char[] chars = word.toCharArray();
            for (char c : chars) {
                if (c >= 'a' && c <= 'z') {
                    counts[c - 'a']++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 'a'));
            System.out.print(": ");
            System.out.println(counts[i]);
        }
    }
}