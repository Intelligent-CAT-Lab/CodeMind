import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] prime = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            prime[i] = i;
        }
        prime[1] = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i < sqrt; i++) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j = 2 * i; j < n + 1; j += i) {
                prime[j] = 0;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i < n + 1; i++) {
            if (prime[i] != 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (count != 0) {
                    map.put(i, count);
                }
            }
        }
        int ans = 1;
        for (int v : map.values()) {
            ans *= (v + 1);
        }
        System.out.println(map.size() + " " + (ans - 1));
    }
}