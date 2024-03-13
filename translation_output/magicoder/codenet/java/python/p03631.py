<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03631 {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// å¥å
    	int a = sc.nextInt();

    	int a100 = a/100;
    	int a10 = a/10 - a100*10;
    	int a1 = a - a100*100 - a10*10;
    	int rev = a1*100 + a10*10 + a100;
    	String ans;

    	if (a == rev){
    		ans = "Yes";
    	} else {
    		ans = "No";
    	}

    	// åºå
    	System.out.println(ans);
    }
}
```

@@ Response
```python
# Python code

# å¥å
a = int(input())

a100 = a // 100
a10 = a // 10 - a100 * 10
a1 = a - a100 * 100 - a10 * 10
rev = a1 * 100 + a10 * 10 + a100
ans = "Yes" if a == rev else "No"

# åºå
print(ans)
```<｜end▁of▁sentence｜>
