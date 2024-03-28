<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
Brown


```
# coding: utf-8
a,b=map(int,input().split())
print('Alice' if abs(a-b)>1 else 'Brown')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String output = a > b ? "Alice" : "Brown";
        System.out.println(output);
    }
}
```</s>
