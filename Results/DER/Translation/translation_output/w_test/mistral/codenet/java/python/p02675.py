<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
N = int(input())

if N % 10 in [2, 4, 5, 7, 9]:
    print("hon")
elif N % 10 in [0, 1, 6, 8]:
    print("pon")
elif N % 10 == 3:
    print("bon")
```</s>
