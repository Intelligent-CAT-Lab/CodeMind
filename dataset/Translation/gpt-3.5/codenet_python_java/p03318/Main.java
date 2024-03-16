import java.util.*;
import java.io.*;

public class p03318 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        D();
    }

    static void D() throws IOException {
        int K = Integer.parseInt(br.readLine());
        int ans = 1;
        int i = 0;

        while (K > 0) {
            bw.write(ans + "\n");
            K--;

            if (Sunuke(ans + (int)Math.pow(10, i)) > Sunuke(ans + (int)Math.pow(10, i + 1))) {
                i++;
            }

            ans += Math.pow(10, i);
        }

        bw.flush();
    }

    static double Sunuke(int a) {
        String numStr = String.valueOf(a);
        int sum = 0;
        for (char c : numStr.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return (double) a / sum;
    }
}