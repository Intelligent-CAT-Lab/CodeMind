import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        Character letter = null;
        while (true) {
            if ((sentence.charAt(start) != ' ') && (sentence.charAt(start) != '?')) {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        if (letter != null && "aeiouy".contains(Character.toString(letter).toLowerCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}