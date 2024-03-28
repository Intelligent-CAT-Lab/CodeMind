import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        char[] t = new char[s.length];

        // Reverse the input and perform transformations.
        for (int i = 0; i < s.length; i++) {
            char reversedChar = s[s.length - 1 - i];
            t[i] = reversedChar;
            if (t[i] == 'p') {
                t[i] = 'q';
            } else if (t[i] == 'q') {
                t[i] = 'p';
            } else if (t[i] == 'b') {
                t[i] = 'd';
            } else if (t[i] == 'd') {
                t[i] = 'b';
            }
        }

        String ans = new String(s).equals(new String(t)) ? "Yes" : "No";
        System.out.println(ans);
    }
}