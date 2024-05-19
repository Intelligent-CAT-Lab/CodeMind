System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
5 -69

```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int min = Math.min(A, B);
        int max = Math.max(A + B - N, 0);
        System.out.println(min + " " + max);
    }
}
```

Test input:
```
10 3 5
```

Expected output:
```
5 -69
```<|endoftext|>
