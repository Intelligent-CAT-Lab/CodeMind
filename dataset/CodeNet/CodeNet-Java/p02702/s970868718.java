import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        int n = str.length();
        int p = 2019;
        
        // ans: i桁目～j桁目の部分列が2019の倍数であるパターン数
        // ex. 1817181712114
        //         ^^^^^
        long ans = 0;
        
        // 2019の倍数になる桁i, jの組み合わせ全探索はO(N^2)
        // -> 各桁の「2019の余り」をO(N)で計算する。
        
        // d'[i]: 右からi桁目の値 * 10^i (mod 2019)
        // ex. 1817181712114
        // d'[0]: 4 % 2019 -> 4
        // d'[1]: 10 % 2019 -> 10
        // d'[5]: 700000 (mod 2019) -> ?
        // ≡ 7 * 10 * 10^4
        // ≡ 7 * 19240
        // ≡ 7 * 1069 = 7483 % 2019 = 1426
        
        // d[i]: d'[i]の累積和
        // d = {4,14,114,95}
        int[] d = new int[n+1];
        // ten: 10^i (mod 2019)
        int ten = 1;
        
        // d[i]を計算する
        // (右の桁(c[n-1])から順に見る)
        for (int i = n - 1; i >= 0; i--) {
            // 1000000 % 2019は計算しんどいので、
            int a = ((c[i] - '0') * ten) % p;
            d[i] = (d[i+1] + a) % p;
            ten = (ten * 10) % p;
        }
        
        // 「d[i] = d[j]となる」とは、
        // 「ex. 181712114 % 2019 = 2114 % 2019」。
        // -> 181710000 ≡ 0 (mod 2019)
        // -> (合同式で割り算はmod pと互いに素でないと不能)
        // -> (gcd(2019, 10) = 1)
        // -> 18171 ≡ 0 (mod 2019)
        // -> 18171 % 2019 = 0
        // -> 18171は2019の倍数
        
        // map: d[]の値の頻度
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = n; i >= 0; i--) {
            int key = d[i];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int val = map.get(key);
                map.put(key, val + 1);
            }
        }
        // 同じ値の個数nから2つ選ぶパターン数 = nC2
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            ans += (long)val * (val-1) / 2;
        }
        System.out.println(ans);
    }
}