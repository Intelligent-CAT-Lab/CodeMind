<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

paint_cans = set()

for i in range(3):
    paint_cans.add(int(input()))

print(len(paint_cans))
```
This code uses the `set` data structure to store the unique values of the paint cans. The `input()` function is used to read the values from the user, and the `len()` function is used to get the number of elements in the set.

Note that the `input()` function is used instead of `scan.nextInt()` in Java, as Python does not have a built-in `Scanner` class.</s>
