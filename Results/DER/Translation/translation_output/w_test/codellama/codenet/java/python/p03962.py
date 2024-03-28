<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```
import sys

def main():
    paint_cans = set()
    for i in range(3):
        paint_cans.add(int(input()))
    print(len(paint_cans))

if __name__ == "__main__":
    main()
```
This code uses the `set` data structure to store the unique values of the paint cans. It then uses the `len` function to get the number of elements in the set and print it to the console.

The `input` function is used to read the input from the user, and the `int` function is used to convert the input to an integer.

The `if __name__ == "__main__":` block is used to indicate that the `main` function should be executed when the script is run as a standalone program.</s>
