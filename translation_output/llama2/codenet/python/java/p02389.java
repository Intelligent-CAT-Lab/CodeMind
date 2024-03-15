<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

```

### Input

```
1 2
```

### Output

```
2 6
```

### Explanation

```
a = 1
b = 2

a*b = 1*2 = 2
(a+b)*2 = (1+2)*2 = 6
```

### Hint

- Use the `map` function to convert the input to integers.
- Use the `*` operator to multiply two numbers.
- Use the `+` operator to add two numbers.
- Use the `*` operator to multiply a number by 2.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a*b);
        System.out.println((a+b)*2);
    }
}
```
</s>
