<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03206 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int D=stdIn.nextInt();
		if(D==25)
			System.out.println("Christmas");
		if(D==24)
			System.out.println("Christmas Eve");
		if(D==23)
			System.out.println("Christmas Eve Eve");
		if(D==22)
			System.out.println("Christmas Eve Eve Eve");
	}
}
```

@@ Response
```python
D = int(input())
if D == 25:
    print("Christmas")
elif D == 24:
    print("Christmas Eve")
elif D == 23:
    print("Christmas Eve Eve")
elif D == 22:
    print("Christmas Eve Eve Eve")
```<｜end▁of▁sentence｜>
