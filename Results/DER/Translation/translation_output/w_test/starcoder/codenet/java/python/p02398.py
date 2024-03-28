<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 14 80

Expected output:
3


```
import java.util.Scanner;

public class p02398 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    int t = 0;
	    for (int i = x; i <= y; i++) {
	    	if (z % i == 0)
	    		t++;
	    } System.out.println(t);
     }
}


```

python code:<fim_suffix><fim_middle>

```python
import sys

x = int(sys.stdin.readline())
y = int(sys.stdin.readline())
z = int(sys.stdin.readline())

t = 0
for i in range(x, y+1):
	if z % i == 0:
		t += 1
print(t)

```
<|endoftext|>
