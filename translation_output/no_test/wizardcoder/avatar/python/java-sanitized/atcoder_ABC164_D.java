import java.util.*;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = 2019;
        int[] tens = new int[s.length() + 1];
        tens[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            tens[i] = (tens[i - 1] * 10) % k;
        }
        int[] mods0toi = new int[s.length()];
        int cur = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + (s.charAt(i) - '0') * tens[j]) % k;
            cur = mods0toi[i];
        }
        Map<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < mods0toi.length; i++) {
            if (!s.containsKey(mods0toi[i])) {
                s.put(mods0toi[i], 0);
            }
            s.put(mods0toi[i], s.get(mods0toi[i]) + 1);
        }
        int ans = 0;
        List<Integer> t = new ArrayList<>(s.keySet());
        for (int c : t) {
            if (c == 0) {
                ans += s.get(c);
            }
            ans += (s.get(c) * (s.get(c) - 1)) / 2;
        }
        System.out.println(ans);
    }
}