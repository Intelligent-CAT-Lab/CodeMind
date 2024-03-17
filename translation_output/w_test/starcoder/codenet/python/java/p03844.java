<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 + 2

Expected output:
3


```
A,s,B = input().split()
A = int(A)
B = int(B)
if s == '+':
    print(A+B)
elif s == '-':
    print(A-B)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        String op = sc.nextLine();
        if (op.equals("+")) {
            System.out.println(a+b);
        } else if (op.equals("-")) {
            System.out.println(a-b);
        }
    }
}
```

'''
<|endoftext|>
