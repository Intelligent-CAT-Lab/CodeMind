<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scanner.nextLine();
        if (s.charAt(s.length() - 1) == 's') {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```
<|EOT|>
