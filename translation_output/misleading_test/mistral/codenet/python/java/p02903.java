<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
100
10
1
41

```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < h; i++) {
            if (i < b) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < a; j++) {
                    sb.append("0");
                }
                for (int j = a; j < w; j++) {
                    sb.append("1");
                }
                System.out.println(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < a; j++) {
                    sb.append("1");
                }
                for (int j = a; j < w; j++) {
                    sb.append("0");
                }
                System.out.println(sb.toString());
            }
        }
    }
}
```</s>
