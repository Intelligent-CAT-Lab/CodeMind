<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n,i=map(int,input().split())
print(n+1-i)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int i = Integer.parseInt(input[1]);
        System.out.println(n + 1 - i);
    }
}
```<｜end▁of▁sentence｜>
