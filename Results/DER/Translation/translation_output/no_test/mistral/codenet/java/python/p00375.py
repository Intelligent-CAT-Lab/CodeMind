<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    a = int(input())
    print((a - 30) / 2)

if __name__ == "__main__":
    main()
```</s>
