<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}
```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    if b >= a:
        print(a)
    else:
        print(a-1)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import any specific libraries for input/output operations. We can use the built-in `sys.stdin.readline()` function to read input from the console. The `int()` function is used to convert the input string to an integer. The `if` statement is used to check if `b` is greater than or equal to `a`. If it is, `a` is printed. If not, `a-1` is printed.<｜end▁of▁sentence｜>
