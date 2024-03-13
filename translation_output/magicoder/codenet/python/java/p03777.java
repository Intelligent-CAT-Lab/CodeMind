<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=input().split()

if a=='H':
  print(b)
else:
  if b=='H':
    print('D')
  else:
    print('H')
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        if (input[0].equals("H")) {
            System.out.println(input[1]);
        } else {
            if (input[1].equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}
```<｜end▁of▁sentence｜>
