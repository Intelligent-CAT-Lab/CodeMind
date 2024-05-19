System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
814793613347395 1.99

Expected output:
1621439290561408

```
a, b = input ( ). split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        b = b.substring(0, 1) + b.substring(2);
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int result = aInt * bInt / 100;
        System.out.println(result);
    }
}
```

Test input:
814793613347395 1.99

Expected output:
1621439290561408<|endoftext|>
