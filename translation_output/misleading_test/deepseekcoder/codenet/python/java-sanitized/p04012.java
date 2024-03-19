import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        for (char c : alphabet.toCharArray()) {
            if (countOccurrences(w, c) % 2 == 1) {
                System.out.println("No");
                scanner.close();
                return;
            }
        }
        System.out.println("Yes");
        scanner.close();
    }

    private static int countOccurrences(String str, char c) {
        int count = 0;
        for (char temp : str.toCharArray()) {
            if (temp == c) {
                count++;
            }
        }
        return count;
    }
}