<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
59 96

Expected output:
96 154 -55

```
import java.io.*;
import java.util.*;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 0) {
            if (m!= 0)
                System.out.println("Impossible");
            else
                System.out.println(0 + " " + 0);
            return;
        }

        if (m <= n) {
            if (m == 0) {
                m = 1;
            }
            System.out.print(n + " " + (m + n - 1));
            return;
        }

        System.out.print(m + " " + (m + n - 1));
    }
}
```

python code:<fim_suffix><fim_middle>

```python
n, m = map(int, input().split())
if n == 0:
    if m!= 0:
        print("Impossible")
    else:
        print(0, 0)
    exit()
if m <= n:
    if m == 0:
        m = 1
    print(n, m + n - 1)
else:
    print(m, m + n - 1)
```

"""
<|endoftext|>
