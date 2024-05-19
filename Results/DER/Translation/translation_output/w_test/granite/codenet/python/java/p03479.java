System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
3


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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 1;
        int x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }
        System.out.println(count);
    }
}
```

Test input:
```
3 20
```

Expected output:
```
3
```<|endoftext|>
