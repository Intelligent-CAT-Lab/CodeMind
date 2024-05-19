System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba

```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() == 2) {
            System.out.println(input);
        } else {
            System.out.println(new StringBuilder(input).reverse());
        }
    }
}
```

Test input:
```
abc
```

Expected output:
```
cba
```<|endoftext|>
