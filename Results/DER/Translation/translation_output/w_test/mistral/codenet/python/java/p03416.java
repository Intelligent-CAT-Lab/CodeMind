<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
4


```
f, t = [int(i) for i in input().split()]
print(len([i for i in range(f, t+1) if str(i) == str(i)[::-1]]))
```
[/INST]
```java
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int f = Integer.parseInt(split[0]);
        int t = Integer.parseInt(split[1]);
        int count = 0;
        for (int i = f; i <= t; i++) {
            String str = Integer.toString(i);
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```</s>
