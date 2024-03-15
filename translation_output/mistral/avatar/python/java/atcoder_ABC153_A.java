<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int result = (int) Math.ceil(h / a);
        System.out.println(result);
    }
}
```</s>
