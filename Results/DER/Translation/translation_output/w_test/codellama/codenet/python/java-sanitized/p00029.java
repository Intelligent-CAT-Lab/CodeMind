import java.util.Scanner;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (String word : words) {
            int frequency = 0;
            for (String otherWord : words) {
                if (word.equals(otherWord)) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentWord = word;
            }
        }
        System.out.println(mostFrequentWord);
    }
}