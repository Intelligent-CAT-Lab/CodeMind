<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
Brown

```
import java.util.Scanner;
public class p03740 {
    public static void main(String[] args) {
		try{
			Scanner sc  = new Scanner(System.in);
			System.out.println(Math.abs(sc.nextLong() - sc.nextLong()) <= 1 ? "Brown" : "Alice");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
```
[/INST]
```python
import sys

def main():
    try:
        a, b = map(int, sys.stdin.readline().split())
        print("Brown" if abs(a - b) <= 1 else "Alice")
    except Exception as e:
        e.printStackTrace()

if __name__ == "__main__":
    main()
```</s>
