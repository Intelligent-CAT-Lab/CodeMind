Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()

div = len(s) // 2
pre = s[:div]
suf = s[div + 1:]

if s == s[::-1] and pre == pre[::-1] and suf == suf[::-1]:
    print('Yes')
else:
    print('No')

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        if (s.equals(new StringBuilder(s).reverse().toString()) && pre.equals(new StringBuilder(pre).reverse().toString()) && suf.equals(new StringBuilder(suf).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
