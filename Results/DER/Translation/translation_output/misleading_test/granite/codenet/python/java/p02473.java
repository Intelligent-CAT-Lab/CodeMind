System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
91

```
s = input().split()
print(int(s[0]) - int(s[1]))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a - b);
    }
}
```

You can run this code with the following test case:

```
5 8
```

Expected output:
```
-3
```<|endoftext|>
