System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        String s = input[1];
        int B = Integer.parseInt(input[2]);
        int result = 0;
        if (s.equals("+")) {
            result = A + B;
        } else if (s.equals("-")) {
            result = A - B;
        }
        System.out.println(result);
    }
}
```

Test input:
1 + 2

Expected output:
3<|endoftext|>
