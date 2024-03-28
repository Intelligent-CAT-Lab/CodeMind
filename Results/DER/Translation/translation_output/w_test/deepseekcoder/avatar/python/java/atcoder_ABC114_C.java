<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
333333357

Expected output:
8335


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
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        aaa("0");
        System.out.println(count);
    }

    static void aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return;
        }
        if (isContains753(n)) {
            count++;
        }
        for (char c : "753".toCharArray()) {
            aaa(n + c);
        }
    }

    static boolean isContains753(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.equals(new HashSet<Character>() {{
            add('7');
            add('5');
            add('3');
        }});
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then it calls the `aaa` function to count the number of strings of digits that contain only the digits 3, 5, and 7. The result is printed to the standard output.
<|EOT|>
