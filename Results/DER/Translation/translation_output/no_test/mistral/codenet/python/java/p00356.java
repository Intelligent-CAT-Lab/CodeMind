<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b - (int) Math.gcd(a, b) + 1;
        System.out.println(result);
    }
}
```</s>
