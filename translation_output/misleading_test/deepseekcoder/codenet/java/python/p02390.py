<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
46979

Expected output:
13:2:9

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
def convert_seconds(S):
    h = S // 3600
    hi = S % 3600
    m = hi // 60
    s = S % 60
    return f"{h}:{m}:{s}"

# Test input
S = 46979

# Call the function and print the result
print(convert_seconds(S))
```

This Python function takes an integer `S` as input, representing the total number of seconds. It calculates the number of hours, minutes, and seconds by using integer division and modulus operations. The result is returned as a string in the format "hours:minutes:seconds".
<|EOT|>
