<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
24

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

### Response:
```python
import sys

def main():
    paint_cans = set()
    for line in sys.stdin:
        for num in line.split():
            paint_cans.add(int(num))

    print(len(paint_cans))

if __name__ == "__main__":
    main()
```

This Python code reads integers from standard input, stores them in a set (which automatically removes duplicates), and then prints the number of unique integers.
<|EOT|>
