<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

def main():
    sc = sys.stdin.readline().split()
    count = [0] * 5
    for i in range(5):
        x = int(sc[i])
        count[i] += x
        if count[i] == 0:
            anser = i
    print(anser + 1)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the given Java code. The `sys` module is used to read input from the standard input stream, and the `split()` method is used to split the input into a list of strings. The `int()` function is used to convert the input to integers. The `range()` function is used to iterate over the indices of the `count` list, and the `if` statement is used to check if the current index is the answer. Finally, the `print()` function is used to print the answer.</s>
