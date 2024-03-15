<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println((int) Math.ceil(k / 2) * (k / 2));
    }
}
```</s>
