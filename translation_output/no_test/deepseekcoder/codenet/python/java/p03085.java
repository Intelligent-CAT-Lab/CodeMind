<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
b=input()
if b =='A':
    print('T')
elif b=='C':
    print('G')
elif b=='G':
    print('C')
else:
    print('A')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char b = scanner.next().charAt(0);
        if (b == 'A') {
            System.out.println('T');
        } else if (b == 'C') {
            System.out.println('G');
        } else if (b == 'G') {
            System.out.println('C');
        } else {
            System.out.println('A');
        }
    }
}
```
<|EOT|>
