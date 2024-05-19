System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}
```


Answer:
```python
import java.util.Scanner;

public class p03826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() * sc.nextInt(), b = sc.nextInt() * sc.nextInt();
        System.out.println((a < b)? b : a);
        sc.close();
    }
}
```<|endoftext|>
