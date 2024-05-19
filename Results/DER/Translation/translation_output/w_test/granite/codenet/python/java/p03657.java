System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5

Expected output:
Possible


```
# ABC067 A - Sharing Cookies
a,b = map(int,input().split())

if a%3 == 0:
    print('Possible')
elif b%3 == 0:
    print('Possible')
elif (a+b)%3 == 0:
    print('Possible')
else:
    print('Impossible')
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
```

Test input:
```
4 5
```

Expected output:
```
Possible
```<|endoftext|>
