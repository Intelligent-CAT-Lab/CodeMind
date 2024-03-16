<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = [int(x) for x in input().split()]
j = [2,3,4,5,6,7,8,9,10,11,12,13,1]
if j.index(a) > j.index(b):
  print('Alice')
elif j.index(a) < j.index(b):
  print('Bob')
else:
  print('Draw')

```

@@ Response
```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        List<Integer> j = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1);
        if (j.indexOf(a) > j.indexOf(b)) {
            System.out.println("Alice");
        } else if (j.indexOf(a) < j.indexOf(b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, and then checks which one comes first in the list `j`. If the first integer comes first, it prints "Alice". If the second integer comes first, it prints "Bob". If they are the same, it prints "Draw".<｜end▁of▁sentence｜>
