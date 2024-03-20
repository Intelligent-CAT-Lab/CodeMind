import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(", ");
        String output = "";
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            output += firstLetter.toUpperCase() + restOfWord.toLowerCase() + " ";
        }
        System.out.println(output.trim());
    }
}