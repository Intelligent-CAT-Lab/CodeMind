import java.util.Scanner;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] letters = input.split("");
        int[] counts = new int[26];
        for (String letter : letters) {
            if (letter.matches("[a-zA-Z]")) {
                counts[letter.toLowerCase().charAt(0) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('a' + i) + ": " + counts[i] + "\n");
        }
    }
}