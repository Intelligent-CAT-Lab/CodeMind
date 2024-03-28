<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:


import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        new p02915().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int ans = S * S* S;


        System.out.println(ans);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

S = int(sys.stdin.readline())
ans = S ** 3

print(ans)
```
Explanation:

* `import sys` imports the `sys` module, which provides access to the standard input and output streams.
* `S = int(sys.stdin.readline())` reads a line of input from the standard input stream and converts it to an integer using the `int()` function.
* `ans = S ** 3` calculates the cube of `S` using the `**` operator.
* `print(ans)` prints the result to the standard output stream.</s>
