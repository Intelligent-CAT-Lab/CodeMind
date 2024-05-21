import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < Alfa.length(); i++) {
            if (countOccurrences(w, Alfa.charAt(i)) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}