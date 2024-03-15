<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())
print((a-1)*(b-1))
```

### Input

```
4 5
```

### Output

```
12
```

### Explanation

```
a = 4
b = 5

(a-1)*(b-1) = 3*4 = 12
```

### Hint

- Use ```Integer.parseInt()``` to convert a string to an integer.
- Use ```String.split()``` to split a string into a list of strings.
- Use ```map()``` to apply a function to each element of a list.
- Use ```print()``` to print a string.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println((a-1)*(b-1));
    }
}
```
</s>
