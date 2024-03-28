import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = primeFactorization(n);
        int len = map.size();
        int val = 1;
        for (int v : map.values()) {
            val *= (v + 1);
        }
        System.out.println(len + " " + (val - 1));
    }

    static Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return map;
    }
}