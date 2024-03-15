<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}
```
[/INST]
```python
import sys

r = int(input("Enter the value of r: "))
g = int(input("Enter the value of g: "))
b = int(input("Enter the value of b: "))

sum = r + g + b
print(sum % 4 == 0)
```</s>
