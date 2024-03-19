import java.util.Scanner;

public class p03856 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numList = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            numList[i] = input.length() - input.replace(words[i], "").length();
        }
        numList[0] -= numList[1];
        numList[2] -= numList[3];
        numList[4] -= numList[5];
        numList[1] -= (numList[4] + numList[5]);
        numList[0] += (numList[4] + numList[5]);
        int total = numList[0] * 5 + numList[1] * 7 + numList[2] * 5 + numList[3] * 6;
        if (total == input.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}