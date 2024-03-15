import java.util.*;

public class p02254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        Map<Character, Integer> dict_string = new HashMap<>();
        Map<Character, Integer> dict_depth = new HashMap<>();

        for (char c : S.toCharArray()) {
            if (dict_string.containsKey(c)) {
                dict_string.put(c, dict_string.get(c) + 1);
            } else {
                dict_string.put(c, 1);
                dict_depth.put(c, 0);
            }
        }

        Map<Character, Integer> dict_string_calc = new HashMap<>(dict_string);

        while (dict_string_calc.size() != 1) {
            char x = '\0';
            char y = '\0';

            for (Map.Entry<Character, Integer> entry : dict_string_calc.entrySet()) {
                if (x == '\0') {
                    x = entry.getKey();
                    int x_cnt = entry.getValue();
                    continue;
                }

                if (y == '\0') {
                    y = entry.getKey();
                    int y_cnt = entry.getValue();
                    break;
                }

                for (char c : (x + y)) {
                    if (dict_depth.containsKey(c)) {
                        dict_depth.put(c, dict_depth.get(c) + 1);
                    } else {
                        throw new RuntimeException();
                    }
                }
            }

            dict_string_calc.remove(x);
            dict_string_calc.remove(y);

            dict_string_calc.put(x + y, x_cnt + y_cnt);
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> entry : dict_depth.entrySet()) {
            ans += dict_string.get(entry.getKey()) * entry.getValue();
        }

        if (dict_string.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
    }
}