System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
t, h = map ( int, input ( ). split ( ) )
print ( ( h - 2 ) // ( t - 1 ) + 1 )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int t = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        int result = (h - 2) / (t - 1) + 1;
        System.out.println(result);
    }
}
```<|endoftext|>
