<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a = list ( map ( int , input ( ) . split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and stores the integers in an array. Then it iterates over the array, and if it finds an integer that is 0, it prints the index of that integer plus 1 (because array indices are 0-based, but the problem statement seems to want 1-based indices) and breaks out of the loop.<｜end▁of▁sentence｜>
