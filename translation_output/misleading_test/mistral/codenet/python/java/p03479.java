<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
32

```
 #a = 314159265
#b = 358979323846264338
a, b = map(int, input().split())
count = 1
x = a
#print(x)
while x * 2 <= b:
    x = x * 2
    #print(x)
    count += 1
print(count)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 314159265;
        int b = 358979323846264338;
        int count = 1;
        int x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count++;
        }
        System.out.println(count);
    }
}
```</s>
