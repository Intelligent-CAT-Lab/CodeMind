System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
18


```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        int result = Math.max(Character.getNumericValue(n.charAt(0)) - 1 + 9 * (n.length() - 1), sum);
        System.out.println(result);
    }
}
```

Test input:
100

Expected output:
18<|endoftext|>
