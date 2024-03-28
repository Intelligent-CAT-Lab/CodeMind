import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        String[] punctuation = {",", ".", "?", "!"};
        for (String token : tokens) {
            for (String punct : punctuation) {
                if (token.contains(punct)) {
                    token = token.replace(punct, punct + " ");
                }
            }
        }
        String output = String.join(" ", tokens);
        for (String punct : punctuation) {
            output = output.replace(" " + punct, punct);
        }
        System.out.println(output);
    }
}


After all the tokens have been processed, the code joins the tokens back into a single string using the space character as a delimiter. Finally, it iterates over each punctuation character and replaces any instances of the punctuation character followed by a space with just the punctuation character.