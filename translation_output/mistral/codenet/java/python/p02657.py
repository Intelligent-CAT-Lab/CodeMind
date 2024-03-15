<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02657 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(A*B);

	}
}

```
[/INST]
```python
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    A = sc.nextInt()
    B = sc.nextInt()
    print(A*B)

if __name__ == '__main__':
    main()
```</s>
