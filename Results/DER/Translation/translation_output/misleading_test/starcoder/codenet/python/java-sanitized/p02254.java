import java.util.*;

public class p02254 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        Map<Character, Integer> dict_string = new HashMap<>();
        Map<Character, Integer> dict_depth = new HashMap<>();

        for (char s : S.toCharArray()) {
            if (dict_string.containsKey(s)) {
                dict_string.put(s, dict_string.get(s) + 1);
            } else {
                dict_string.put(s, 1);
                dict_depth.put(s, 0);
            }
        }

        Map<Character, Integer> dict_string_calc = new HashMap<>(dict_string);

        while (dict_string_calc.size()!= 1) {
            char x = null;
            char y = null;

            for (char k : dict_string_calc.keySet()) {
                if (x == null) {
                    x = k;
                    x_cnt = dict_string_calc.get(k);
                    continue;
                }

                if (y == null) {
                    y = k;
                    y_cnt = dict_string_calc.get(k);
                    break;
                }
            }

            for (char s : (x + y)) {
                if (dict_depth.containsKey(s)) {
                    dict_depth.put(s, dict_depth.get(s) + 1);
                } else {
                    throw new RuntimeException();
                }
            }

            dict_string_calc.remove(x);
            dict_string_calc.remove(y);

            dict_string_calc.put(x + y, x_cnt + y_cnt);
        }

        int ans = 0;

        for (char k : dict_depth.keySet()) {
            ans += dict_string.get(k) * dict_depth.get(k);
        }

        if (dict_string.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
    }
}