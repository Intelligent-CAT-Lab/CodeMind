System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
number = input ( )
a, b, k = [ int ( ele ) for ele in number. split ('â') ]
res = a - k
if res < 0 :
    a = 0
    b = b + res
    b = 0 if b < 0 else b
else :
    a = res
print ( a, b )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] elements = number.split(" â ");
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[1]);
        int k = Integer.parseInt(elements[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = b < 0? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```<|endoftext|>
