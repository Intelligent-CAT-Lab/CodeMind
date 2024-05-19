System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBA

Expected output:
Yes


```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = s.contains("A") && s.contains("B")? "Yes" : "No";
        System.out.println(result);
    }
}
```

Test input:
BBA

Expected output:
Yes<|endoftext|>
