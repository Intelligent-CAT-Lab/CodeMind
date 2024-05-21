import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p03362 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        List<Integer> prime = new ArrayList<>();
        boolean[] isPrime = new boolean[2001];
        for (int i = 2; i <= 2000; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= 2000; i++) {
            if (isPrime[i]) {
                prime.add(i);
                for (int j = i + i; j <= 2000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(prime.get(i)).append(" ");
        }
        System.out.println(sb.toString());
    }
}