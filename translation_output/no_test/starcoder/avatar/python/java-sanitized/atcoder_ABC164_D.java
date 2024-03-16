import java.util.*;
import java.io.*;

public class atcoder_ABC164_D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = 2019;
        int[] tens = new int[s.length() + 1];
        tens[0] = 1;
        for (int i = 1; i < tens.length; i++) {
            tens[i] = tens[i - 1] * 10 % k;
        }
        int[] mods0toi = new int[s.length()];
        int cur = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + (s.charAt(i) - '0') * tens[j]) % k;
            cur = mods0toi[i];
        }
        Map<Integer, Integer> sMap = new HashMap<>();
        for (int i = 0; i < mods0toi.length; i++) {
            if (sMap.containsKey(mods0toi[i])) {
                sMap.put(mods0toi[i], sMap.get(mods0toi[i]) + 1);
            } else {
                sMap.put(mods0toi[i], 1);
            }
        }
        int ans = 0;
        Set<Integer> sSet = sMap.keySet();
        for (int c : sSet) {
            if (c == 0) {
                ans += sMap.get(c);
            }
            ans += (sMap.get(c) * (sMap.get(c) - 1) / 2);
        }
        System.out.println(ans);
    }
}