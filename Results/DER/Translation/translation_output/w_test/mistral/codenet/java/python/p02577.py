<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
Yes


```
import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long c=0;
        for(int i=0;i<s.length();i++){
            c+=(s.charAt(i)-'0');
        }
        if(c%9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

```
[/INST]
```python
s = input()
c = sum(int(char) - 48 for char in s)
if c % 9 == 0:
    print("Yes")
else:
    print("No")
```</s>
