import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        String punctuation = " ,.?!";
        for (int i = 0; i < punctuation.length(); i++) {
            char ch = punctuation.charAt(i);
            s = s.replace(String.valueOf(ch), ch + " ▁ ");
        }

        s = "▁".join(" ", s.trim().split("\\s+"));

        for (int i = 0; i < punctuation.length(); i++) {
            char ch = punctuation.charAt(i);
            s = s.replace(" ▁ " + ch, String.valueOf(ch));
        }

        System.out.println(s);
    }
}