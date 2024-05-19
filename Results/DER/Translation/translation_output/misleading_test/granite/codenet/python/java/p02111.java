System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0 0 58

```
print(*divmod(int(input())*2,60))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] result = divmod(input * 2, 60);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] divmod(int dividend, int divisor) {
        int[] result = new int[2];
        result[0] = dividend / divisor;
        result[1] = dividend % divisor;
        return result;
    }
}
```

You can run this code with the following test case:

```
0
```

Expected output:
```
0 0 58
```<|endoftext|>
