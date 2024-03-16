<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;

public class codeforces_334_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int square = n * n;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        
        for (int i = 1; i <= square; i++) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        
        int loop = square / n;
        int div = loop / 2;
        // debug(div);
        
        for (int i = 1; i <= loop; i++) {
            for (int j = 0; j < div; j++) {
                if (i % 2 == 1) {
                    pw.print(odd.remove(0) + " " + (even.remove(even.size() - 1)) + " ");
                } else {
                    pw.print(even.remove(0) + " " + (odd.remove(odd.size() - 1)) + " ");
                }
            }
            pw.println();
        }
        
        pw.close();
    }
    
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
```

### Response:
```python
import sys

def main():
    n = int(input())
    square = n * n
    odd = []
    even = []

    for i in range(1, square + 1):
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)

    loop = square // n
    div = loop // 2

    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                print(odd.pop(0), end=' ')
                print(even.pop(), end=' ')
            else:
                print(even.pop(0), end=' ')
                print(odd.pop(), end=' ')
        print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, creates two lists of odd and even numbers up to the square of the input number, and then prints out the numbers in a specific pattern. The `pop(0)` method is used to remove and return the first element of the list, which is equivalent to the `remove(0)` method in Java. The `pop()` method without an index is used to remove and return the last element of the list, which is equivalent to the `remove(size() - 1)` method in Java. The `print` function with `end=' '` is used to print the numbers on the same line, separated by spaces. The `print` function with no arguments is used to print a newline.
<|EOT|>
