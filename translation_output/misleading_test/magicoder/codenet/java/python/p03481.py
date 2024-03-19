<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 20

Expected output:
31

```
import java.util.*;
public class p03481 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i);
    }
}
```

@@ Response
```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())

    i = 0
    while X <= Y:
        i += 1
        X *= 2

    print(i)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the console. The `map(int, sys.stdin.readline().split())` function splits the input into two integers and assigns them to the variables `X` and `Y`.

The `while` loop continues until `X` is greater than `Y`. Inside the loop, `X` is doubled and `i` is incremented by 1.

Finally, the function `print(i)` prints the value of `i`, which is the number of times `X` was doubled before it surpassed `Y`.<｜end▁of▁sentence｜>
