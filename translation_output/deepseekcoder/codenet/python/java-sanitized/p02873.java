import java.util.Scanner;

public class p02873 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == '>') {
                sho[i + 1] = 0;
            } else {
                sho[i + 1] = sho[i] + 1;
            }
        }

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(S.length() - i - 1);
            if (s == '<') {
                dai[n - i - 2] = 0;
            } else {
                dai[n - i - 2] = dai[n - i - 1] + 1;
            }
        }

        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += Math.max(sho[i], dai[i]);
        }

        System.out.println(maxSum);
    }
}