<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
25

Expected output:
1h[VsO1|s

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
[/INST]
```
import sys

def main():
    D = int(sys.stdin.readline().strip())
    if D == 25:
        print("Christmas")
    elif D == 24:
        print("Christmas Eve")
    elif D == 23:
        print("Christmas Eve Eve")
    elif D == 22:
        print("Christmas Eve Eve Eve")

if __name__ == "__main__":
    main()
```</s>
