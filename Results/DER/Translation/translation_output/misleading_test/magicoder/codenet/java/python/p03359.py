<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5

Expected output:
-80

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

@@ Response
```python
# Python code

# Read input from user
a, b = map(int, input().split())

# Check if b is greater than or equal to a
if b >= a:
    print(a)
else:
    print(a-1)
```

Test input:
5 5

Expected output:
-80<｜end▁of▁sentence｜>
