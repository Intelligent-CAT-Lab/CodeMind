<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
68

Expected output:
19


```

import java.util.Scanner;

class p00375
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a - 30) / 2);
    }

}


```

### Response:
```python
def main():
    a = int(input())
    print((a - 30) // 2)

if __name__ == '__main__':
    main()
```
<|EOT|>
