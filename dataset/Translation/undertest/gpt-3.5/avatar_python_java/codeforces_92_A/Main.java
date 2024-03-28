import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class codeforces_92_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        int i = 0;
        int ans = 0;
        while (true) {
            if (i + 1 > m) {
                ans = m;
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }
        
        System.out.println(ans);
    }
}