Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.Scanner;

class p00375:

    def main(self):
        sc = Scanner(System.in)
        a = sc.nextInt()

        print((a - 30) // 2)

p00375().main()
```

Note: In Python, integer division is performed using the double forward slash (//) operator instead of the single forward slash (/).<|endoftext|>
