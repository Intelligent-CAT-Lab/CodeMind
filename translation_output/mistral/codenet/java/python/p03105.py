<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03105 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int A= entrada.nextInt();
        int B= entrada.nextInt();
        int C= entrada.nextInt();
        int N=(int)B/A;
        if (N>C){
            System.out.println(C);
        }
        else{
            System.out.println(N);
        }
    }
    
}

```
[/INST]
```python
import sys

A = int(input("Enter A: "))
B = int(input("Enter B: "))
C = int(input("Enter C: "))

N = B // A
if N > C:
    print(C)
else:
    print(N)
```</s>
