<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) != '0') {
                int sum = 0;
                for (int j = 0; j < n.length(); j++) {
                    sum += n.charAt(j) - '0';
                }
                System.out.println(sum);
                return;
            }
        }

        if (n.charAt(0) == '1') {
            System.out.println(10);
            return;
        }

        System.out.println(n.charAt(0));
    }
}
```
[/INST]
```python
import sys

n = input()

for i in range(1, len(n)):
    if n[i] != '0':
        sum = 0
        for j in range(len(n)):
            sum += ord(n[j]) - ord('0')
        print(sum)
        sys.exit()

if n[0] == '1':
    print(10)
    sys.exit()

print(n[0])
```</s>
