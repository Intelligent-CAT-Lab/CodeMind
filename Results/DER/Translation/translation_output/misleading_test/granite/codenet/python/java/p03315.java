System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
+-++

Expected output:
40

```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countPlus = 0;
        int countMinus = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+') {
                countPlus++;
            } else if (input.charAt(i) == '-') {
                countMinus++;
            }
        }

        System.out.println(countPlus - countMinus);
    }
}
```

Test input:
+-++

Expected output:
40<|endoftext|>
