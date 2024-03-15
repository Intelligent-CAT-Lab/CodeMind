<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())

print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))


```

### Hint

- [Java String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
- [Java Integer](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html)
- [Java Bitwise Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html)

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("{:032b}".format(a & b));
        System.out.println("{:032b}".format(a | b));
        System.out.println("{:032b}".format(a ^ b));
    }
}
```
</s>
