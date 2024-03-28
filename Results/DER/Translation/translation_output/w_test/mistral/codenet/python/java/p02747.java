<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
hihi

Expected output:
Yes


```
S = input() 
if (S == 'hi' or S == 'hihi' or S == 'hihihi' or S == 'hihihihi' or S == 'hihihihihi'):
  print('Yes')
else:
  print('No')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("hi") || input.equals("hihi") || input.equals("hihihi") || input.equals("hihihihi") || input.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
