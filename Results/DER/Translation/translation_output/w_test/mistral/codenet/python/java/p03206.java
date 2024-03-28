<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
Christmas


```
D=int(input())
d={25:'Christmas',24:'Christmas Eve',23:'Christmas Eve Eve',22:'Christmas Eve Eve Eve'}
print(d[D])
```
[/INST]
```java
import java.util.HashMap;
import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        HashMap<Integer, String> d = new HashMap<>();
        d.put(25, "Christmas");
        d.put(24, "Christmas Eve");
        d.put(23, "Christmas Eve Eve");
        d.put(22, "Christmas Eve Eve Eve");
        System.out.println(d.get(D));
    }
}
```</s>
