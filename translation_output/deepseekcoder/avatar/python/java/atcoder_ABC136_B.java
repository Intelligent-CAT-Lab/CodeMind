<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
cnt = 0
for i in range ( 1 , n + 1 ) :
    s = str ( i )
    if len ( s ) % 2 == 1 :
        cnt += 1
print ( cnt )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```
<|EOT|>
