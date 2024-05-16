System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Set<Integer> paintCans = new HashSet<Integer>();
		paintCans.add(scan.nextInt());
		paintCans.add(scan.nextInt());
		paintCans.add(scan.nextInt());

		System.out.println(paintCans.size());
	}

}
```


Answer:
```python
import sys

def main():
    paintCans = set()
    for color in sys.stdin.read().split():
        paintCans.add(int(color))
    print(len(paintCans))

if __name__ == '__main__':
    main()
```<|endoftext|>
