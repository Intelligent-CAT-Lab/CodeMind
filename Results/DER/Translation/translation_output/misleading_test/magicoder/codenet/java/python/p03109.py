<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2019/04/30

Expected output:
|Fi+<i

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
Here is the Python equivalent of the given Java code:

```python
def main():
    time = input().split('/')[2]
    if time[0] == '1' or int(time[1]) > 4:
        print("TBD")
    else:
        print("Heisei")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a date in the format "YYYY/MM/DD" from the user, and then checks if the day is greater than 4 or the first digit of the day is 1. If either condition is true, it prints "TBD". Otherwise, it prints "Heisei".<｜end▁of▁sentence｜>
