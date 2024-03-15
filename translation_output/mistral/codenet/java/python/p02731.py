<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02731{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double L = scan.nextInt();
		scan.close();
		System.out.println(Math.pow(L/3, 3));
	}
}

```
[/INST]
```python
import sys

def main():
    L = int(input())
    print(pow(L/3, 3))

if __name__ == "__main__":
    main()
```</s>
