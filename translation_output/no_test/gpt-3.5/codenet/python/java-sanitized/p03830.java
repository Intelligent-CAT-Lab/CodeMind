import java.util.*;
import java.io.*;

public class p03830 {
    static int mod = 1000000007;

    static int[] LI() throws IOException {
        String[] input = br.readLine().split(" ");
        int[] res = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            res[i] = Integer.parseInt(input[i]);
        }
        return res;
    }

    static int II() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static String[] LS() throws IOException {
        return br.readLine().split(" ");
    }

    static String S() throws IOException {
        return br.readLine();
    }

    static List<Pair> factorization(int n) {
        List<Pair> result = new ArrayList<>();
        int m = n;
        while (m % 2 == 0) {
            result.add(new Pair(2, 1));
            m /= 2;
        }
        for (int i = 3; i * i <= m; i += 2) {
            while (m % i == 0) {
                if (result.size() > 0 && result.get(result.size() - 1).getKey() == i) {
                    result.get(result.size() - 1).setValue(result.get(result.size() - 1).getValue() + 1);
                } else {
                    result.add(new Pair(i, 1));
                }
                m /= i;
            }
        }
        if (m > 1) {
            result.add(new Pair(m, 1));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        int n = II();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (Pair pair : factorization(i)) {
                int k = pair.getKey();
                int v = pair.getValue();
                d.put(k, d.getOrDefault(k, 0) + v);
            }
        }
        long r = 1;
        for (int c : d.values()) {
            r *= (c + 1);
            r %= mod;
        }
        bw.write(Long.toString(r));
        bw.flush();
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static class Pair {
        int key, value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}