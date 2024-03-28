import java.util.Scanner;

public class p03856 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};

        int[] numlist = new int[6];
        for (int i = 0; i < a.length; i++) {
            numlist[i] = countOccurrences(S, a[i]);
        }

        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);  // Correct the miscounted dreamers
        numlist[0] += (numlist[4] + numlist[5]);  // Recount into dreams

        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Function to count occurrences of a substring in a string
    public static int countOccurrences(String str, String word) {
        int count = 0;
        int wordLength = word.length();
        int index = 0;

        // Iterate over the string and find occurrences
        while ((index = str.indexOf(word, index)) != -1) {
            count++;
            index += wordLength;
        }

        return count;
    }
}