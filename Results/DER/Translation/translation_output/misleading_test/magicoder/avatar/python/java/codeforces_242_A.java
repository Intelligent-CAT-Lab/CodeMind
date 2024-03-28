<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
6
4 2
4 3
5 2
5 3
5 4

```
x , y , a , b = [ int ( i ) for i in input ( ) . split ( ) ]
c = [ [ i , j ] for i in range ( a , x + 1 ) for j in range ( b , y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        List<int[]> c = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c.add(new int[]{i, j});
                }
            }
        }

        System.out.println(c.size());
        for (int[] pair : c) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, then generates all pairs of integers `(i, j)` where `a <= i <= x` and `b <= j <= y` and `i > j`. It then prints the number of such pairs and prints each pair on a separate line.<｜end▁of▁sentence｜>
