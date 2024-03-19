<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
UDS

```
import java.util.Scanner;
public class p04043{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if(a== 5 && b == 7 && c ==5){
      	System.out.println("YES");
      }else if(a== 5 && b== 5 &&c ==7){
      	System.out.println("YES");
      }else if(a == 7 && b == 5&& c ==5){
      	System.out.println("YES");
      }else{
      	System.out.println("NO");
      }
    }
}
```
[/INST]
```python
a = int(input())
b = int(input())
c = int(input())

if a == 5 and b == 7 and c == 5:
    print("YES")
elif a == 5 and b == 5 and c == 7:
    print("YES")
elif a == 7 and b == 5 and c == 5:
    print("YES")
else:
    print("NO")
```</s>
