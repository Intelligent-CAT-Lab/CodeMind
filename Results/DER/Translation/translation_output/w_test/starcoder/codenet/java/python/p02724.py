<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1024

Expected output:
2020


```
import java.util.Scanner;

public class p02724 {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			
			int gohyaku = X/500;
			
			X = X-500*gohyaku;
			
			int goen = X/5;
			
			
			System.out.println(1000*gohyaku+5*goen);
		}
		
		
	}
		

}

```

python code:<fim_suffix><fim_middle>

```python
import sys

X = int(sys.stdin.readline())

gohyaku = X//500

X = X-500*gohyaku

goen = X//5

print(1000*gohyaku+5*goen)

```
<|endoftext|>
