<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
ABC


```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```

### Response:
```python
import sys

def main():
    words = sys.stdin.readline().split()
    for word in words[:3]:
        print(word[0].upper(), end='')
    print("")

if __name__ == "__main__":
    main()
```

This Python code reads a line of input from the standard input, splits it into words, and then prints the first letter of each word in uppercase. The `end=''` argument in the `print` function is used to prevent a newline after each character.
<|EOT|>
