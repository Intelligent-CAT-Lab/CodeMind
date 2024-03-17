<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
ABC


```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```
[/INST]
```python
import sys

for i in range(3):
    print(sys.stdin.readline().strip().upper()[0])
```</s>
