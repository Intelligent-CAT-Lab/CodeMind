<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
16

Expected output:
pon


```
import java.util.*;
import java.lang.*;
import java.io.*;

public class p02675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        switch(N%10){
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
              System.out.println("hon");
              break;
            case 0:
            case 1:
            case 6:
            case 8:
              System.out.println("pon");
              break;
            case 3:
              System.out.println("bon");
              break;
        }
    }
}

```

### Response:
```python
def main():
    N = int(input())

    last_digit = N % 10

    if last_digit in [2, 4, 5, 7, 9]:
        print("hon")
    elif last_digit in [0, 1, 6, 8]:
        print("pon")
    elif last_digit == 3:
        print("bon")

if __name__ == "__main__":
    main()
```
<|EOT|>
