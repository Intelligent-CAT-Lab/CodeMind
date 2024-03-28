<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000 3000

Expected output:
2000


```
m,f,b =map(int, input().split())
if m+f<b:
  print("NA")
elif m>=b:
  print("0")
else:
  print(b-m)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, f, b;
        m = sc.nextInt();
        f = sc.nextInt();
        b = sc.nextInt();
        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
    }
}
```</s>
