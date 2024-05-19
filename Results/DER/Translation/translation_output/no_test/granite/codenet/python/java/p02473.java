System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        String[] s = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(s[0]) - Integer.parseInt(s[1]));
    }
}
```<|endoftext|>
