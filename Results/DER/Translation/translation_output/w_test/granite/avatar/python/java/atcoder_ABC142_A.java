System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
64

Expected output:
0.5000000000


```
N = int ( input ( ) )
if N % 2 == 0 :
    print ( 0.5 )
else :
    print ( ( N + 1 ) / N / 2 )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double result;
        if (N % 2 == 0) {
            result = 0.5;
        } else {
            result = (double) (N + 1) / N / 2;
        }
        System.out.println(result);
    }
}
```

Test input:
```
64
```

Expected output:
```
0.5000000000
```<|endoftext|>
