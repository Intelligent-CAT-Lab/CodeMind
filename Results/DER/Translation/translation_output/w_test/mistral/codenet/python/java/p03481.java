<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
3


```
import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[2];
        n[0] = scanner.nextInt();
        n[1] = scanner.nextInt();
        int X = n[0];
        int Y = n[1];
        int k = (Y / X) / (1 << (Integer.bitCount(Y / X)));
        System.out.println(k);
    }
}
```</s>
