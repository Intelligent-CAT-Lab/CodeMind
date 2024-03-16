<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        String s = sc.nextLine();
        if (s.equals("+")) {
            System.out.println(a + b);
        } else if (s.equals("-")) {
            System.out.println(a - b);
        }
    }
}
```
<|endoftext|>
