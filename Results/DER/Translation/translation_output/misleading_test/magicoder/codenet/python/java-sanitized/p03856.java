import java.util.Scanner;

public class p03856 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numlist = {0, 0, 0, 0, 0, 0};

        for (int i = 0; i < a.length; i++) {
            numlist[i] = countOccurrences(S, a[i]);
        }
        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);
        numlist[0] += (numlist[4] + numlist[5]);
        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int countOccurrences(String str, String word) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(word, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += word.length();
            }
        }
        return count;
    }
}