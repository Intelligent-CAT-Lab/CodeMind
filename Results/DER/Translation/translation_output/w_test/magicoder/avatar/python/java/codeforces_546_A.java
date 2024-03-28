<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 1000000000 1000

Expected output:
0

```
k , n , w = map ( int , input ( ) . strip ( ) . split ( ) )
sum = 0
for i in range ( 1 , w + 1 ) :
    sum += k * i
if sum <= n :
    print ( 0 )
else :
    print ( sum - n )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the total cost of the bananas, and then compares it to the amount of money the user has. If the total cost is less than or equal to the amount of money, it prints 0. Otherwise, it prints the difference between the total cost and the amount of money.<｜end▁of▁sentence｜>
