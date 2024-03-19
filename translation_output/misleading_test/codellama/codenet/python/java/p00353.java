<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000 3000

Expected output:
1956

```
m,f,b =map(int, input().split())
if m+f<b:
  print("NA")
elif m>=b:
  print("0")
else:
  print(b-m)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int b = sc.nextInt();

        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
    }
}
```

Note: The `map` function in Python is not available in Java, so we need to use the `Scanner` class to read the input and convert it to integers.</s>
