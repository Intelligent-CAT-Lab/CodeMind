<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
Alice


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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int[] j = {2,3,4,5,6,7,8,9,10,11,12,13,1};
        int indexA = -1, indexB = -1;

        for (int i = 0; i < j.length; i++) {
            if (j[i] == a) {
                indexA = i;
            }
            if (j[i] == b) {
                indexB = i;
            }
        }

        if (indexA > indexB) {
            System.out.println("Alice");
        } else if (indexA < indexB) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, then it finds the indices of these integers in the array `j`. It compares these indices and prints the appropriate result.<｜end▁of▁sentence｜>
