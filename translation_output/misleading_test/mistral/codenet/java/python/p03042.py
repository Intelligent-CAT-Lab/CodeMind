<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1905

Expected output:
YYMM

```


import java.util.Scanner;

public class p03042 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int yy = S / 100;
		int mm = S % 100;

		if(1 <= yy && yy <= 12) {
			if(1 <= mm && mm <= 12) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(1 <= mm && mm <= 12) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}

	}

}

```
[/INST]
```python
S = int(input())
yy = S // 100
mm = S % 100

if 1 <= yy <= 12:
    if 1 <= mm <= 12:
        print("AMBIGUOUS")
    else:
        print("MMYY")
else:
    if 1 <= mm <= 12:
        print("YYMM")
    else:
        print("NA")
```</s>
