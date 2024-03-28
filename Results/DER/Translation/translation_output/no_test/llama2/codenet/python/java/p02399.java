<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)
```

### Solution

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d %f", a / b, a % b, (float) a / b);
    }
}
```
</s>
