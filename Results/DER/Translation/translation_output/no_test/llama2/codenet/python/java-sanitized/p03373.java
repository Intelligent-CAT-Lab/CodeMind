import java.io.*;
import java.util.*;

public class p03373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int ans = 0;
        if (2 * c <= a + b) {
            ans += Math.min(x, y) * 2 * c;
            int q = Math.min(x, y);
            x -= q;
            y -= q;
            if (x && 2 * c <= a) {
                ans += 2 * c * x;
            } else if (x) {
                ans += a * x;
            } else if (y && 2 * c <= b) {
                ans += 2 * c * y;
            } else {
                ans += b * y;
            }
        } else {
            ans = x * a + y * b;
        }
        System.out.println(ans);
    }
}