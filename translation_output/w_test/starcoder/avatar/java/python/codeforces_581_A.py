<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
45 99

Expected output:
45 27


```
import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > 0 && b > 0) {
                count++;
                a--;
                b--;
            } else break;
        }
        int ans = a / 2 + b / 2;
        System.out.println(count + " " + ans);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
a, b = map(int, input().split())
count = 0
while a > 0 and b > 0:
    count += 1
    a -= 1
    b -= 1
print(count, a // 2 + b // 2)
```
<|endoftext|>
