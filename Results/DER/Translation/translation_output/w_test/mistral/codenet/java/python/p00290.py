<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 2

Expected output:
40


```

import java.util.Scanner;

public class p00290 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(d*c);

    }
}


```
[/INST]
```python
d = int(input())
c = int(input())
print(d*c)
```</s>
