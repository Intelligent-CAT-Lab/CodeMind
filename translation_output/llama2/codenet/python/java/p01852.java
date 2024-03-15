<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```

### Hint

- [bin](https://docs.python.org/3/library/functions.html#bin)
- [len](https://docs.python.org/3/library/functions.html#len)
- [if](https://docs.python.org/3/reference/compound_stmts.html#the-if-statement)
- [else](https://docs.python.org/3/reference/compound_stmts.html#the-else-clause)
- [print](https://docs.python.org/3/library/functions.html#print)

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(bin(n).length() - 2);
    }

    public static String bin(int n) {
        String bin = Integer.toBinaryString(n);
        return bin.substring(2);
    }
}
```
</s>
