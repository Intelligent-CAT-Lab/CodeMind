<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    words = sys.stdin.readline().split()
    for word in words[:3]:
        print(word[0].upper(), end='')
    print()

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `split()` function is used to split the input into words. We then iterate over the first three words, print the first character of each word in uppercase, and print a newline character at the end.<｜end▁of▁sentence｜>
