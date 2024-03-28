<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 9

Expected output:
No

```
a,b,c = map(int,input().split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            if (4 * a * b < (c - a - b) * (c - a - b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```
Note: The `map` function in Python is not available in Java, so we need to use the `Scanner` class to read the input and convert it to integers.</s>
