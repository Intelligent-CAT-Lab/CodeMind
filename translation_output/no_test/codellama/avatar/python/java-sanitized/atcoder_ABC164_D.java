import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class atcoder_ABC164_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = 2019;
        int[] tens = new int[s.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            tens[i] = tens[i - 1] * 10 % k;
        }
        int[] mods0toi = new int[s.length()];
        int cur = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + s.charAt(i) * tens[j]) % k;
            cur = mods0toi[i];
        }
        s = Arrays.stream(mods0toi).boxed().collect(Collectors.toList());
        int ans = 0;
        for (int c : s.keySet()) {
            if (c == 0) {
                ans += s.get(c);
            }
            ans += (s.get(c) * (s.get(c) - 1)) / 2;
        }
        System.out.println(ans);
    }
}