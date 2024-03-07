import java.util.Scanner;

public class codeforces_49_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        String letter = "";
        while (start >= 0) {
            if (sentence.charAt(start) != ' ' && sentence.charAt(start) != '?') {
                letter = sentence.substring(start, start + 1);
                break;
            }
            start--;
        }
        if (letter.toLowerCase().matches("[aeiouy]")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}