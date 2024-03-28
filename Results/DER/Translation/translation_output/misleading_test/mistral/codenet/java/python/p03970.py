<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
C0DEFESTIVAL2O16

Expected output:
97

```
import java.util.Scanner;

public class p03970 {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		String S = input.nextLine();
		input.close();
		String correct = "CODEFESTIVAL2016";
		int num = 0;
		for(int i = 0; i < 16;i++){
			if(S.charAt(i) != correct.charAt(i)) num++;
		}
		System.out.println(num);
	}

}

```
[/INST]
```python
S = input()
correct = "CODEFESTIVAL2016"
num = 0
for i in range(16):
    if S[i] != correct[i]:
        num += 1
print(num)
```</s>
