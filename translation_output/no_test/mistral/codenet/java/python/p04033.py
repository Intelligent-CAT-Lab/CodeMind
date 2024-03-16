<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04033 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int a=s.nextInt(),b=s.nextInt();
		if(a<=0&&0<=b)
			System.out.println("Zero");
		else
			System.out.println((Math.min(0,b)-Math.min(-1,a))%2==1?"Positive":"Negative");
	}
}

```
[/INST]
```python
import sys

def main():
    a = int(input())
    b = int(input())
    if a <= 0 and 0 <= b:
        print("Zero")
    else:
        print((min(0, b) - min(-1, a)) % 2 == 1 ? "Positive" : "Negative")

if __name__ == "__main__":
    main()
```</s>
