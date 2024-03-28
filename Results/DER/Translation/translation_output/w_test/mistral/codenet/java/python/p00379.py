<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
16 2 1000

Expected output:
3


```
import java.util.Scanner;

class p00379{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = (int) Math.pow(m, (double) 1 / n);
		
		int ans = 0;
		for(int i = 1; i <= max; i++) {
			int x = (int) Math.pow(i, n);
			String str = String.valueOf(x);
			int y = 0;
			for(int j = 0; j < str.length(); j++) {
				y += Integer.parseInt(str.substring(j, j + 1));
			}
			
			if(y + a == i) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}

```
[/INST]
```python
import math

def p00379():
    a = int(input())
    n = int(input())
    m = int(input())
    max = int(math.pow(m, 1 / n))
    
    ans = 0
    for i in range(1, max+1):
        x = int(math.pow(i, n))
        str = str(x)
        y = 0
        for j in range(len(str)):
            y += int(str[j])
        if y + a == i:
            ans += 1
    
    print(ans)

p00379()
```</s>
