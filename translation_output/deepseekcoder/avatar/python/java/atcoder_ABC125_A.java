<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A , B , T = map ( int , input ( ) . split ( ) )
ans = ( T // A ) * B
print ( ans )


```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int T = Integer.parseInt(input[2]);
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and assigns them to variables A, B, and T. It then calculates `(T // A) * B` and prints the result.
<|EOT|>
