<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}
```
[/INST]
```python
import sys

def main():
    w, h = map(int, input().split())
    if w == 1 or h == 1:
        print(1)
        return
    c = (w*h)%2 == 0 ? (w*h)//2 : (w*h)//2+1
    print(c)

if __name__ == "__main__":
    main()
```</s>
