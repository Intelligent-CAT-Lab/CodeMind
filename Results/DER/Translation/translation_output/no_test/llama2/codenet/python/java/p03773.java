<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())

print((a + b) % 24)

```

### Input

```
4 5
```

### Output

```
19
```

### Explanation

```
a = 4
b = 5

(a + b) = 9

(9 + 24) % 24 = 19
```

### Hint

- Use the `map` function to convert the input to an `int`
- Use the `mod` operator to get the remainder of the division

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a + b) % 24);
    }
}
```
</s>
