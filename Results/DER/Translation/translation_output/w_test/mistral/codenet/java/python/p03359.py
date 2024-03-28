<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5

Expected output:
5


```
import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}
```
[/INST]
```python
a = int(input())
b = int(input())

if b >= a:
    print(a)
else:
    print(a-1)
```</s>
