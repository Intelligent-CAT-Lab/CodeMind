import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p02873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        
        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];
        
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int index = i + 1;
            if (s == '>') {
                sho[index] = 0;
            } else {
                sho[index] = sho[index - 1] + 1;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            char s = S.charAt(i);
            int index = n - i - 2;
            if (s == '<') {
                dai[index] = 0;
            } else {
                dai[index] = dai[index + 1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for (int num : seq) {
            sum += num;
        }

        System.out.println(sum);
    }
}