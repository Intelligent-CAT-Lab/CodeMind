<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1


```
import java.util.Scanner;

public class p02924 {

    public static void main(String args[]) {

        // å¥å
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // ä¸»å¦ç
        long result = 0;
        for (int i = n - 1; 0 < i; i--) {
            result += i;
        }

        // åºå
        System.out.println(result);
        sc.close();
    }

}
```
[/INST]
```python
n = int(input())
result = 0
for i in range(n-1, 0, -1):
    result += i
print(result)
```</s>
