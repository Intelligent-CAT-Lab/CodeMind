<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
103

```
A, B = map(int, input().split())

list = [A+B, 2*A-1, 2*B-1]
print(max(list))


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int[] list = {A+B, 2*A-1, 2*B-1};
        System.out.println(max(list));
    }

    public static int max(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }
}
```

Note: The `map` function in Python is not available in Java, so we need to use a different approach to convert the input to integers. In this case, we use the `Scanner` class to read the input and convert it to integers using the `nextInt()` method.</s>
