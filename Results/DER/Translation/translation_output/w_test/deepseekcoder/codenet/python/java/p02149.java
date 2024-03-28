<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```

### Response:
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> S = Arrays.stream(args[0].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        if (S.indexOf(Collections.max(S)) == 0) {
            System.out.println("A");
        } else if (S.indexOf(Collections.max(S)) == 1) {
            System.out.println("B");
        } else if (S.indexOf(Collections.max(S)) == 2) {
            System.out.println("C");
        }
    }
}
```

In the Java version, we use `Arrays.stream()` to convert the input string into a stream of integers. We then use `Collectors.toList()` to convert the stream into a list. The `Collections.max()` function is used to find the maximum value in the list. The `indexOf()` function is used to find the index of the maximum value in the list.

Please note that the input to the Java program should be passed as a command line argument. For example, you can run the program with the command `java Main "1000 900 850"`.
<|EOT|>
