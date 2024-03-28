<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
5


```
a = list ( map ( int , input ( ) . split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("0")) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

This Java code reads a line of input from the user, splits it into an array of strings, and then iterates over the array. If it finds a string that equals "0", it prints the index of that string plus one (because array indices in Java start at 0) and breaks out of the loop.

You can test this code with the input "1 2 3 4 0" and it will output "5".<｜end▁of▁sentence｜>
