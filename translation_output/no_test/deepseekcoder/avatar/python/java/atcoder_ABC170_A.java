<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = list ( map ( int , input ( ) . split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```

### Response:
Here is the Java equivalent of the given Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = Arrays.asList(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new));
        for (int e = 0; e < a.size(); e++) {
            if (a.get(e) == 0) {
                System.out.println(e + 1);
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of space-separated integers from the standard input, converts them to a list of integers, and then iterates over the list. If it finds an integer that is 0, it prints the 1-based index of that integer and stops.
<|EOT|>
