import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            int tmp = i;
            for (int j = 2; j <= tmp; j++) {
                while (tmp % j == 0) {
                    if (map.containsKey(j)) {
                        map.put(j, map.get(j) + 1);
                    } else {
                        map.put(j, 1);
                    }
                    tmp /= j;
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