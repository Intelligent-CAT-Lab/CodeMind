System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < h; i++) {
            if (i < b) {
                for (int j = 0; j < a; j++) {
                    System.out.print(0);
                }
                for (int j = a; j < w; j++) {
                    System.out.print(1);
                }
            } else {
                for (int j = 0; j < a; j++) {
                    System.out.print(1);
                }
                for (int j = a; j < w; j++) {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
```

You can run this code with the following test case:

```
3 3 1 1
```

The output should be:

```
100
10
1
```<|endoftext|>
