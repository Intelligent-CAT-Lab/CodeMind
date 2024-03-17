import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        Map<Character, Integer> dict_string = new HashMap<>();
        Map<Character, Integer> dict_depth = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (dict_string.containsKey(s)) {
                dict_string.put(s, dict_string.get(s) + 1);
            } else {
                dict_string.put(s, 1);
                dict_depth.put(s, 0);
            }
        }

        Map<Character, Integer> dict_string_calc = new HashMap<>(dict_string);

        while (dict_string_calc.size()!= 1) {
            char x = '\0';
            char y = '\0';
            int x_cnt = 0;
            int y_cnt = 0;

            for (Map.Entry<Character, Integer> entry : dict_string_calc.entrySet()) {
                char k = entry.getKey();
                int v = entry.getValue();
                if (x == '\0') {
                    x = k;
                    x_cnt = v;
                    continue;
                }
                if (y == '\0') {
                    y = k;
                    y_cnt = v;
                    break;
                }
            }

            for (char s : (x + y)) {
                if (dict_depth.containsKey(s)) {
                    dict_depth.put(s, dict_depth.get(s) + 1);
                } else {
                    throw new RuntimeException("Invalid input");
                }
            }

            dict_string_calc.remove(x);
            dict_string_calc.remove(y);

            dict_string_calc.put((char) (x + y), x_cnt + y_cnt);
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> entry : dict_depth.entrySet()) {
            char k = entry.getKey();
            int v = entry.getValue();
            ans += dict_string.get(k) * v;
        }

        if (dict_string.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
    }
}