<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
68

Expected output:
95

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
[/INST]
```python
a = int(input())
print((a - 30) / 2)
```</s>
