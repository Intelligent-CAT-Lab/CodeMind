import java.util.Scanner;

public class p03856 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};

        int[] numlist = new int[6];
        for (int i = 0; i < a.length; i++) {
            numlist[i] = countOccurrences(S, a[i]);
        }
        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);          // Adjust dreamer count
        numlist[0] += (numlist[4] + numlist[5]);          // Adjust dream count
        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int countOccurrences(String haystack, String needle) {
        return (haystack.length() - haystack.replace(needle, "").length()) / needle.length();
    }
}