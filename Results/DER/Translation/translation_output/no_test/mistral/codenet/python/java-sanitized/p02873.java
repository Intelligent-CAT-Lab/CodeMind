import java.util.*;

public class p02873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '>') {
                sho[i+1] = 0;
            } else {
                sho[i+1] = sho[i] + 1;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '<') {
                dai[i] = 0;
            } else {
                dai[i] = dai[i+1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        System.out.println(Arrays.stream(seq).sum());
    }
}