System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            if (4 * a * b < (c - a - b) * (c - a - b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```<|endoftext|>
