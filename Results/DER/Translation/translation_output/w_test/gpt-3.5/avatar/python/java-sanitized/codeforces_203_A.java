import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_203_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int da = Integer.parseInt(st.nextToken());
        int db = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}