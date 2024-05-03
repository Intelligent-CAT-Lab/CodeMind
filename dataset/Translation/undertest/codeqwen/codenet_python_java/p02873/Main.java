import java.util.Scanner;

public class p02873 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        //int[] l = Arrays.stream(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        //int A = scanner.nextInt();
        //int B = scanner.nextInt();
        //int C = scanner.nextInt();
        //int[][] S = new int[h][];
        //for (int i = 0; i < h; i++) {
        //    S[i] = Arrays.stream(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        //}
        //scanner.close();

        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            i += 1;
            if (s == '>') {
                sho[i] = 0;
            } else {
                sho[i] = sho[i - 1] + 1;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            char s = S.charAt(i);
            i = n - i - 2;
            if (s == '<') {
                dai[i] = 0;
            } else {
                dai[i] = dai[i + 1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for (int i : seq