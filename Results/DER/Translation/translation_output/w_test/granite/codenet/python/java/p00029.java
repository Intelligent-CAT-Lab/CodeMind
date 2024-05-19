System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures


```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```


Answer:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        Arrays.sort(a, (s1, s2) -> s2.length() - s1.length());
        System.out.println(a[0]);
        Arrays.sort(a, (s1, s2) -> s2.compareTo(s1));
        System.out.println(a[0]);
    }
}
```

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures
<|endoftext|>
