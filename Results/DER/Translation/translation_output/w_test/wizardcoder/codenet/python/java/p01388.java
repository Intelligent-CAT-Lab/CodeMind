Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KUPCkupcKUPC

Expected output:
2


```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = 0, u = 0, p = 0, c = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'K') {
                k++;
            } else if (ch == 'U') {
                u++;
            } else if (ch == 'P') {
                p++;
            } else if (ch == 'C') {
                c++;
            }
        }
        System.out.println(Math.min(k, Math.min(u, Math.min(p, c))));
    }
}
```<|endoftext|>
