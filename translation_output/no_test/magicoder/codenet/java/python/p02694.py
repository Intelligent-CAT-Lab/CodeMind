<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p02694 {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        int count=0;

        long a=100;
        while(true){
            if(a>=x){
                break;
            }
            a=a+a/100;
            count++;
        }
        System.out.println(count);
        
    }

}
```

@@ Response
```python
import sys

def main():
    x = int(sys.stdin.readline())
    count = 0

    a = 100
    while True:
        if a >= x:
            break
        a = a + a // 100
        count += 1
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a long integer from the standard input, initializes a counter to 0, and a variable `a` to 100. It then enters a loop where it checks if `a` is greater than or equal to `x`. If it is, it breaks out of the loop. If not, it increases `a` by `a/100` and increments the counter. Finally, it prints the counter.<｜end▁of▁sentence｜>
