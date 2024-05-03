Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

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

        while (dict_string_calc.size() != 1) {
            char x = ' ';
            char y = ' ';
            int x_cnt = 0;
            int y_cnt = 0;

            for (Map.Entry<Character, Integer> entry : dict_string_calc.entrySet()) {
                if (x == ' ') {
                    x = entry.getKey();
                    x_cnt = entry.getValue();
                    continue;
                }

                if (y == ' ') {
                    y = entry.getKey();
                    y_cnt = entry.getValue();
                    break;
                }
            }

            for (char s : (x + y).toCharArray()) {
                if (dict_depth.containsKey(s)) {
                    dict_depth.put(s, dict_depth.get(s) + 1);
                } else {
                    throw new RuntimeException("Invalid state");
                }
            }

            dict_string_calc.remove(x);
            dict_string_calc.remove(y);

            dict_string_calc.put((char) (x + y), x_cnt + y_cnt);
        }

        int
