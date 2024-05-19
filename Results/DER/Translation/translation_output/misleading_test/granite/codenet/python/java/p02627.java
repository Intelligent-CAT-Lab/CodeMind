System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
B

Expected output:
A

```
n = input()

if n.isupper():
    print("A")
elif n.islower():
    print("a")
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (n.matches("[A-Z]")) {
            System.out.println("A");
        } else if (n.matches("[a-z]")) {
            System.out.println("a");
        }
    }
}
```

Test input:
B

Expected output:
A<|endoftext|>
