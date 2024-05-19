System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().toUpperCase().split(" ");
        System.out.println(strings[0].charAt(0) + strings[1].charAt(0) + strings[2].charAt(0));
    }
}
```<|endoftext|>
