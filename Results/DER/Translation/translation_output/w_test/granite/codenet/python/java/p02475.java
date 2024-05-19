System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
0


```
a,b = map(int,input().split())

def round(a, b):
	if a * b < 0:
		return -(-a//b)
	else:
		return a//b

print(round(a, b))

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if (a * b < 0) {
            result = -(-a / b);
        } else {
            result = a / b;
        }

        System.out.println(result);
    }
}
```

Test input:
5 8

Expected output:
0<|endoftext|>
