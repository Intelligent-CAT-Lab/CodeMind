<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 10000

Expected output:
NO


```
numbers = list ( map ( int , input ( ) . split ( ) ) )
start = 0
arr = [ ]
count = 0
for i in range ( 0 , numbers [ 0 ] ) :
    string = " "
    next = start
    for j in range ( 0 , numbers [ 0 ] ) :
        if count < numbers [ 1 ] :
            if j == next :
                string += ' L '
                count += 1
                next += 2
                if next >= numbers [ 0 ] :
                    start = 1 if start == 0 else 0
            else :
                string += " S "
        else :
            string += " S "
    arr . append ( string )
if count < numbers [ 1 ] :
    print ( " NO " )
else :
    print ( " YES " )
    for i in arr :
        print ( i )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int start = 0;
        String[] arr = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder string = new StringBuilder();
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < m) {
                    if (j == next) {
                        string.append(" L ");
                        count++;
                        next += 2;
                        if (next >= n) {
                            start = (start == 0) ? 1 : 0;
                        }
                    } else {
                        string.append(" S ");
                    }
                } else {
                    string.append(" S ");
                }
            }
            arr[i] = string.toString();
        }
        if (count < m) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, then it creates an array of strings and fills it with the same logic as the Python code. If the count of 'L's is less than the given number 'm', it prints "NO", otherwise it prints "YES" and then prints each string in the array.<｜end▁of▁sentence｜>
