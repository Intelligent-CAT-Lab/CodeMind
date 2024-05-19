System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
4


```
f, t = [int(i) for i in input().split()]
print(len([i for i in range(f, t+1) if str(i) == str(i)[::-1]]))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int firstNumber = Integer.parseInt(input[0]);
        int secondNumber = Integer.parseInt(input[1]);
        int count = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            String numberString = Integer.toString(i);
            String reversedNumberString = new StringBuilder(numberString).reverse().toString();

            if (numberString.equals(reversedNumberString)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
```

Test input:
11009 11332

Expected output:
4<|endoftext|>
