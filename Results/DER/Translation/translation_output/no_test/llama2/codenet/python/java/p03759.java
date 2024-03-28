<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
if b-a==c-b:
  print('YES')
else:
  print('NO')
```

### Explanation

```
a,b,c=map(int,input().split())
```

This line of code takes the input from the user and splits it into three parts.

```
if b-a==c-b:
  print('YES')
else:
  print('NO')
```

This line of code checks if the difference between b and a is equal to the difference between c and b. If it is, it prints YES, otherwise it prints NO.

### Hints

- Use the `Integer` class to convert the input to an integer.
- Use the `if` statement to check if the difference between b and a is equal to the difference between c and b.
- Use the `print` statement to print the result.

### Solutions

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
</s>
