<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures


```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] a = input.split(" ");
        System.out.println(Arrays.stream(a).max(Comparator.comparingInt(String::length)).get() + " " + Arrays.stream(a).max(Comparator.comparing(String::toString)).get());
    }
}
```</s>
