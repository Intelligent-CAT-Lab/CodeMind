<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = (n+1)/2
print(int(a))
```

### Hint

- Use ```System.out.println()``` to print the result.
- Use ```Math.ceil()``` to round up the result.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n+1)/2;
        System.out.println(a);
    }
}
```
</s>
