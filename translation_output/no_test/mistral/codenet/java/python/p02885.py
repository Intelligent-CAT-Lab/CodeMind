<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}
```
[/INST]
```python
import sys

line = input()
line1 = line.split()
a = int(line1[0])
b = int(line1[1])
if a > 2 * b:
    print(a - 2 * b)
else:
    print(0)
```</s>
