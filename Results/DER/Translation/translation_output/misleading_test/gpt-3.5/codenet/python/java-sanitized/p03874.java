import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class p03874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(br.readLine());
        
        int n = 512;
        int pattern = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = factorial(7 + i) / (factorial(i) * factorial(7));
            a.add(val);
        }
        Collections.reverse(a);
        
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }
        
        for (int i = 0; i < n; i++) {
            ans[i] += new String(new char[k / a.get(i)]).replace('\0', 'L');
            k %= a.get(i);
        }
        Collections.reverse(a);
        
        StringBuilder sb = new StringBuilder();
        for (String item : ans) {
            sb.append(item);
        }
        
        System.out.println(sb.toString());
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}