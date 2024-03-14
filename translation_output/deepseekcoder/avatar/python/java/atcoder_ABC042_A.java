<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```

ABC = tuple ( map ( int , input ( ) . split ( ) ) )
if ABC . count ( 5 ) == 2 :
    print ( ' YES ' if sum ( ABC ) == 17 else ' NO ' )
else :
    print ( ' NO ' )


```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countFive = (int) Arrays.stream(ABC).filter(x -> x == 5).count();
        if (countFive == 2) {
            int sum = Arrays.stream(ABC).sum();
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of integers, and then checks if there are two 5's in the array. If so, it checks if the sum of the array is 17. If the sum is 17, it prints "YES", otherwise it prints "NO". If there are not two 5's in the array, it always prints "NO".
<|EOT|>
