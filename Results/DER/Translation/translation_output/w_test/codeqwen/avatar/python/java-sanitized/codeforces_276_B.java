import java.util.HashMap;
import java.util.Map;

public class codeforces_276_B {
    public static void main(String[] args) {
        String s = "ocvxailppytfwwqmfsaabdpzewzkziyhlywwwtcefmyoonfyfzwnrvttjfxxioctfnhmnrxptxtbearaqppopkokscggnenigwkpnyqkvcoldlcvybyqofnopaumykogqxhsovcfdbaiysqrmahasbcqaywvshdxlwkwvosxbrcwfewqcjqmqutebrrywxsrmuyeztlchlegzbbiojbdoycocqxgduswebgkzeuqkcmkyhfmimegfygxglwqowj";
        System.out.println(second(s));
    }

    public static String second(String s) {
        Map<Character, Integer> dt = new HashMap<>();
        for (char i : s.toCharArray()) {
            if (dt.containsKey(i)) {
                dt.put(i, dt.get(i) + 1);
            } else {
                dt.put(i, 1);
            }
        }
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            return "First";
        } else if (!x && s.length() % 2 == 0) {
            return "Second";
        } else if (!x && s.length() % 2 != 0) {
            return "First";
        }
        return "";
    }
}