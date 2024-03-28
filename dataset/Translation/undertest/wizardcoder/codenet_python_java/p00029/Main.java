import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String maxWord = "";
        String maxWord2 = "";
        int maxCount = 0;
        int maxCount2 = 0;
        for (String word : words) {
            int count = Collections.frequency(Arrays.asList(words), word);
            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }
            if (word.length() > maxCount2) {
                maxCount2 = word.length();
                maxWord2 = word;
            }
        }
        System.out.println(maxWord);
        System.out.println(maxWord2);
    }
}