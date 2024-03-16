<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import math
n = int ( input ( ) )
x = 1
while math . log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math . log2 ( n ) ) )
print ( x )


```
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x++;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}
```</s>
