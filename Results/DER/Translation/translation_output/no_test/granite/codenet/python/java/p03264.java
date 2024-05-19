System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```


Answer:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int result = (int) Math.ceil((double) k / 2) * (k / 2);
        System.out.println(result);
    }
}
```<|endoftext|>
