<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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


while len(dict_string_calc) != 1:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        Map<Character, Integer> dictString = new HashMap<>();
        Map<Character, Integer> dictDepth = new HashMap<>();

        for (char c : S.toCharArray()) {
            dictString.put(c, dictString.getOrDefault(c, 0) + 1);
            dictDepth.put(c, 0);
        }

        Map<Character, Integer> dictStringCalc = new HashMap<>(dictString);

        while (dictStringCalc.size() != 1) {
            char x = 0, y = 0;
            int xCnt = 0, yCnt = 0;
            List<Character> keys = new ArrayList<>(dictStringCalc.keySet());
            Collections.sort(keys, Comparator.comparingInt(dictStringCalc::get));

            for (char key : keys) {
                if (x == 0) {
                    x = key;
                    xCnt = dictStringCalc.get(key);
                    continue;
                }

                if (y == 0) {
                    y = key;
                    yCnt = dictStringCalc.get(key);
                    break;
                }
            }

            for (char c : ("" + x + y).toCharArray()) {
                dictDepth.put(c, dictDepth.get(c) + 1);
            }

            dictStringCalc.remove(x);
            dictStringCalc.remove(y);

            dictStringCalc.put("" + x + y, xCnt + yCnt);
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> entry : dictDepth.entrySet()) {
            ans += dictString.getOrDefault(entry.getKey(), 0) * entry.getValue();
        }

        if (dictString.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It counts the frequency of each character in the input string, and then uses a priority queue to merge the characters with the smallest frequencies together until there is only one character left. The depth of each character in the final merged string is calculated and multiplied by the frequency of the character to get the answer.
<|EOT|>
