<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
sardine

Expected output:
xxxxxxx


```
import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }

    }
}
```

python code:<fim_suffix><fim_middle>

```python
s = input()
for i in range(len(s)):
    print("x", end="")
```
"""
<|endoftext|>
