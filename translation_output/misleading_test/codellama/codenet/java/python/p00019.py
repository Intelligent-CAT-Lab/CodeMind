<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
200

```
import java.util.*;

public class p00019 {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		
		//calculation
		Long ans = 1L;
		for(Long N = sc.nextLong();N>1;N--){
			ans *= N;
		}
		//output
		System.out.println(ans);
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p00019 {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		
		//calculation
		Long ans = 1L;
		for(Long N = sc.nextLong();N>1;N--){
			ans *= N;
		}
		//output
		System.out.println(ans);
	}
}
```

Here is the Python code that translates the Java code:
```
import java.util.Scanner;

public class p00019 {
	
	public static void main(String[] args) {

		# input
		sc = Scanner(System.in)
		
		# calculation
		ans = 1L
		for N in range(sc.nextLong(), 1, -1):
			ans *= N
		
		# output
		print(ans)
	}
}
```
Note that the `range` function in Python is used to iterate over the numbers from the input to 1, and the `*=` operator is used to multiply the `ans` variable by each number in the range.</s>
