<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toUpperCase().split("");
        String s2 = s1[0];
        String s3 = s1[1];
        System.out.println(s2 + s2 + s3);
    }
}
```</s>
