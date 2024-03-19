<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
333333357

Expected output:
8307

```
N = int ( input ( ) )
def aaa ( n ) :
    if int ( n ) > N :
        return 0
    ans = 1 if set ( str ( int ( n ) ) ) == { '7' , '5' , '3' } else 0
    for i in '753' :
        ans += aaa ( n + i )
    return ans
print ( aaa ( '0' ) )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(aaa("0"));
    }

    static int aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = 1;
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        if (!set.contains('7') || !set.contains('5') || !set.contains('3')) {
            ans = 0;
        }
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i);
        }
        return ans;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then calls the `aaa` function with the string "0" as the argument. The `aaa` function recursively generates all possible strings of digits that contain only the digits 3, 5, and 7, and counts how many of these strings are less than or equal to the input number. The result is printed to the standard output.
<|EOT|>
