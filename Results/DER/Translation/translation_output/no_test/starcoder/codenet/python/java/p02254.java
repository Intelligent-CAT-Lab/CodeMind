<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()


dict_string = {}
dict_depth = {}

for s in S:
    if s in dict_string:
        dict_string[s] += 1
    else:
        dict_string[s] = 1
        dict_depth[s] = 0


dict_string_calc = dict_string.copy()


while len(dict_string_calc)!= 1:
    x = None
    y = None

    for k, v in sorted(dict_string_calc.items(), key=lambda x: x[1]):
        if x == None:
            x = k
            x_cnt = v
            continue

        if y == None:
            y = k
            y_cnt = v
            break

    for s in (x + y):
        if s in dict_depth:
            dict_depth[s] += 1
        else:
            raise

    del dict_string_calc[x]
    del dict_string_calc[y]

    dict_string_calc[x + y] = x_cnt + y_cnt


ans = 0

for k, v in dict_depth.items():
    ans += dict_string[k] * v


if len(dict_string) == 1:
    ans = len(S)

print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
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
                    throw new Exception();
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
```
<|endoftext|>
