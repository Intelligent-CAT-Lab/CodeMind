<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p03109{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String time=scn.next().substring(5);
        if(time.charAt(0)=='1'||Character.getNumericValue(time.charAt(1))>4) {
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    time = sys.stdin.readline().split()[1]
    if time[0] == '1' or int(time[1]) > 4:
        print("TBD")
    else:
        print("Heisei")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from the standard input, splits it into words, and takes the second word (which is the time). It then checks if the first character of the time is '1' or if the second character is greater than '4'. If either condition is true, it prints "TBD". Otherwise, it prints "Heisei".<｜end▁of▁sentence｜>
