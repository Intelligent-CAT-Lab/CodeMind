<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02390{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = S / 3600;
        int hi = S % 3600;
        int m = hi / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}

```

### Response:
```python
S = int(input())
h = S // 3600
hi = S % 3600
m = hi // 60
s = S % 60
print(f"{h}:{m}:{s}")
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the number of hours, minutes, and seconds, and prints them in the format "hours:minutes:seconds".
<|EOT|>
