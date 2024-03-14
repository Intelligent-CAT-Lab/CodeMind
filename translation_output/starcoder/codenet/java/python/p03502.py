<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03502 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int N = sc.nextInt();

	int X = N;

	int fx = 0;


	while(N>=10) {

		fx += N%10;

		N /= 10;

	}

	fx += N;

	if(X%fx == 0) System.out.println("Yes");

	else System.out.println("No");
}

}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.Scanner;

public class p03502 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int N = sc.nextInt();

	int X = N;

	int fx = 0;


	while(N>=10) {

		fx += N%10;

		N /= 10;

	}

	fx += N;

	if(X%fx == 0) System.out.println("Yes");

	else System.out.println("No");
}

}
```
<|endoftext|>
