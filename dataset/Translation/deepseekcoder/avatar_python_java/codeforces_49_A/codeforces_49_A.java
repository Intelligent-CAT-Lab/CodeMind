import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        String letter = "";
        while (true) {
            if ((sentence.charAt(start) != ' ') && (sentence.charAt(start) != '?')) {
                letter = String.valueOf(sentence.charAt(start));
                break;
            }
            start--;
        }
        if (("aeiouy").contains(letter.toLowerCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}