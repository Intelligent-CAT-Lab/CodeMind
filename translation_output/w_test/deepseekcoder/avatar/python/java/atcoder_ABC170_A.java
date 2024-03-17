<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        for (int e = 0; e < a.length; e++) {
            if (a[e] == 0) {
                System.out.println(e + 1);
                break;
            }
        }
    }
}
```

This Java code reads a line of input from the user, splits it into an array of strings, converts each string to an integer, and stores the integers in an array. It then iterates over the array, printing the index of the first zero and breaking the loop if it finds one.

Please note that in Python, the index starts from 0, but in Java, the index starts from 0. So, in the Java code, the index is increased by 1 to match the Python code's behavior.
<|EOT|>
