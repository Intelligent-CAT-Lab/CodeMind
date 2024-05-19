System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a = int ( input ( ) )
for i in range ( a, 0, - 1 ) :
    if a % i == 0 :
        print ( i, end ='â')
        a = i


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " â ");
                a = i;
            }
        }
    }
}
```<|endoftext|>
