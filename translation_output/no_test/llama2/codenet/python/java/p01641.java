<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import math

s = raw_input()

memory = [i for i in range(30, 121, 10)]
r = ''
r += ''.join(['+'*i+'>' for i in range(30, 121, 10)])
r += '<' * 10

point = 0
for c in s:
    c = ord(c)
    n = c / 10 - 3
    d = int(math.fabs(point - n))
    if point < n:
        r += '>' * d
    else:
        r += '<' * d
    point = n

    l = int(math.fabs(memory[point] - c))
    if memory[point] < c:
        r += '+' * l
    else:
        r += '-' * l
    memory[point] = c

    r += '.'

print r
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] memory = new int[120];
        StringBuilder r = new StringBuilder();
        r.append("+>");
        for (int i = 30; i < 121; i += 10) {
            r.append("+>");
        }
        r.append("<");
        int point = 0;
        for (char c : s.toCharArray()) {
            int cInt = (int) c;
            int n = cInt / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">");
                for (int i = 0; i < d; i++) {
                    r.append(">");
                }
            } else {
                r.append("<");
                for (int i = 0; i < d; i++) {
                    r.append("<");
                }
            }
            point = n;
            int l = Math.abs(memory[point] - cInt);
            if (memory[point] < cInt) {
                r.append("+");
                for (int i = 0; i < l; i++) {
                    r.append("+");
                }
            } else {
                r.append("-");
                for (int i = 0; i < l; i++) {
                    r.append("-");
                }
            }
            memory[point] = cInt;
            r.append(".");
        }
        System.out.println(r.toString());
    }
}
```
</s>
