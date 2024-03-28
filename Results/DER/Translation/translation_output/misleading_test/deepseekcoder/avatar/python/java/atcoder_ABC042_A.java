<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
YES

```

ABC = tuple ( map ( int , input ( ) . split ( ) ) )
if ABC . count ( 5 ) == 2 :
    print ( ' YES ' if sum ( ABC ) == 17 else ' NO ' )
else :
    print ( ' NO ' )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countFive = (int) Arrays.stream(ABC).filter(x -> x == 5).count();
        if (countFive == 2) {
            System.out.println(Arrays.stream(ABC).sum() == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code reads the input from the console, splits it into an array of integers, counts the number of 5's in the array, and checks if the count is 2. If it is, it checks if the sum of the array elements is 17. If both conditions are met, it prints "YES", otherwise it prints "NO".
<|EOT|>
