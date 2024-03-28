import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] scores = input.split(" ");
        int[] scoresArray = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            scoresArray[i] = Integer.parseInt(scores[i]);
        }
        int maxScore = scoresArray[0];
        int maxScoreIndex = 0;
        for (int i = 1; i < scoresArray.length; i++) {
            if (scoresArray[i] > maxScore) {
                maxScore = scoresArray[i];
                maxScoreIndex = i;
            }
        }
        String letter = "";
        switch (maxScoreIndex) {
            case 0:
                letter = "A";
                break;
            case 1:
                letter = "B";
                break;
            case 2:
                letter = "C";
                break;
        }
        System.out.println(letter);
    }
}