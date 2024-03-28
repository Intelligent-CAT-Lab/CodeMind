<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 4

Expected output:
3


```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        int result = (int) Math.ceil(H / A);
        System.out.println(result);
    }
}
```</s>
