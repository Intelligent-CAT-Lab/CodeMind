<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
def main():
    x, y = map(int, input().split())
    a = [1, 3, 5, 7, 8, 10, 12]
    b = [4, 6, 9, 11]
    if x == 2 or y == 2:
        print('No')
    elif (x in a and y in a) or (x in b and y in b):
        print('Yes')
    else:
        print('No')
main()
```

@@ Response
```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        List<Integer> a = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> b = Arrays.asList(4, 6, 9, 11);
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if (a.contains(x) && a.contains(y) || b.contains(x) && b.contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, checks if either of them is 2, and then checks if both numbers are in either list `a` or `b`. If any of these conditions are true, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
