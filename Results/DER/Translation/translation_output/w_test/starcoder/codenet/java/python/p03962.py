<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
3


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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    n = int(sys.stdin.readline())
    cans = set()
    for i in range(n):
        cans.add(int(sys.stdin.readline()))
    print(len(cans))

if __name__ == "__main__":
    main()
```
<|endoftext|>
