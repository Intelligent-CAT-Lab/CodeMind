System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        String firstNumber = input[0];
        String secondNumber = input[1];
        secondNumber = secondNumber.substring(0, 1) + secondNumber.substring(2);
        int firstInt = Integer.parseInt(firstNumber);
        int secondInt = Integer.parseInt(secondNumber);
        int result = (firstInt * secondInt) / 100;
        System.out.println(result);
    }
}
```<|endoftext|>
