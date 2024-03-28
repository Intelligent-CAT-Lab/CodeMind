import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        char letter = 0;
        while (true) {
            if ((sentence.charAt(start) != ' ') && (sentence.charAt(start) != '?')) {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        if (Character.toLowerCase(letter) == 'a' || Character.toLowerCase(letter) == 'e' ||
                Character.toLowerCase(letter) == 'i' || Character.toLowerCase(letter) == 'o' ||
                Character.toLowerCase(letter) == 'u' || Character.toLowerCase(letter) == 'y') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}