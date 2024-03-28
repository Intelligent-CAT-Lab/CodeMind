<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8
2
3


```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result + 2);
    }
}
```</s>
