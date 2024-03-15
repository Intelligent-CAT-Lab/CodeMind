<s> Translate the following python code to java and enclose your solution inside ```java```:
```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

### Hint

- Use ```String``` class to store the input string.
- Use ```StringBuilder``` class to reverse the string.
- Use ```System.out.println()``` to print the string.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            StringBuilder sb = new StringBuilder(l);
            sb.reverse();
            System.out.println(sb);
        }
    }
}
```
</s>
