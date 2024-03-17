<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 45000

Expected output:
4 0 5


```
import java.util.Scanner;

public class p03471 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int sum=0;
		boolean judge=false;
		int a=0;
		int b=0;
		int c=0;

		for (int i=0; i<X+1; i++) {
			for (int k=0; k<X-i+1; k++) {
				sum = 10000*i + 5000*k + 1000*(X-i-k);
				if (sum==Y) {
					judge = true;
					a=i;
					b=k;
					c=X-i-k;
					break;
				}
			}
		}
		if (judge) {
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
			System.out.print(" ");
			System.out.print(c);

		} else {
			System.out.println("-1 -1 -1");
		}

	}

}
```
[/INST]
```python
# Sample test case
X = 9
Y = 45000

# Initialize variables
sum = 0
judge = False
a = 0
b = 0
c = 0

# Loop through all possible values of a, b, and c
for a in range(X+1):
    for b in range(X-a+1):
        for c in range(X-a-b):
            # Calculate the sum of a, b, and c
            sum = 10000*a + 5000*b + 1000*c
            # Check if the sum is equal to Y
            if sum == Y:
                # Set judge to True and break out of the loops
                judge = True
                break

# Print the values of a, b, and c if judge is True, otherwise print -1 -1 -1
if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")
```</s>
