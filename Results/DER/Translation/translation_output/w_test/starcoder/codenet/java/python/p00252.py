<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Open


```
import java.util.Scanner;
public class p00252 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = stdIn.nextInt();
		}
		if(a[0] == 1 && a[1] == 1) {
			System.out.println("Open");
		}
		else if(a[2] == 1) {
			System.out.println("Open");
		}
		else {
			System.out.println("Close");
		}
		
	}

}
```

python code:<fim_suffix><fim_middle>

```python
import sys

a = [int(x) for x in sys.stdin.readline().split()]

if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
```
<|endoftext|>
