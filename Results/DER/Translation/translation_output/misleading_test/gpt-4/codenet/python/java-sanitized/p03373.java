import java.io.*;

public class p03373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tokens = br.readLine().split(" ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        int c = Integer.parseInt(tokens[2]);
        int x = Integer.parseInt(tokens[3]);
        int y = Integer.parseInt(tokens[4]);

        int ans = 0;
        if (2 * c <= a + b) {
            int q = Math.min(x, y);
            ans += q * 2 * c;
            x -= q;
            y -= q;

            if (x > 0 && 2 * c <= a) {
                ans += 2 * c * x;
            } else if (x > 0) {
                ans += a * x;
            }

            if (y > 0 && 2 * c <= b) {
                ans += 2 * c * y;
            } else if (y > 0) {
                ans += b * y;
            }
        } else {
            ans = x * a + y * b;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}