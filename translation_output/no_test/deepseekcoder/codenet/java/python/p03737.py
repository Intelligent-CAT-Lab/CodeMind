<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
    for i in range(3):
        print(sys.stdin.read(1).upper(), end='')
    print("")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three characters from the standard input, converts them to uppercase, and prints them. The `read(1)` function reads a single character from the standard input. The `upper()` function converts a character to uppercase. The `end=''` argument in the `print` function prevents a newline after each character.
<|EOT|>
