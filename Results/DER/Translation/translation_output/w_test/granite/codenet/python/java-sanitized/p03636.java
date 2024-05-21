import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        int middleWordsCount = words.length - 2;
        String middleWords = "";
        for (int i = 1; i < words.length - 1; i++) {
            middleWords += words[i];
        }
        String output = firstWord + middleWordsCount + lastWord;
        System.out.println(output);
    }
}