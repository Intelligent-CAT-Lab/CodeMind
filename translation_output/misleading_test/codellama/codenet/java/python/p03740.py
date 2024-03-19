<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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
```
import sys

def main():
    try:
        a, b = map(int, sys.stdin.readline().split())
        if abs(a - b) <= 1:
            print("Brown")
        else:
            print("Alice")
    except ValueError:
        print("Alice")

if __name__ == "__main__":
    main()
```
Note: The `sys.stdin.readline()` method is used to read a line of input from the standard input stream. The `map()` function is used to convert the input strings to integers. The `abs()` function is used to calculate the absolute difference between the two numbers. The `print()` function is used to print the output.</s>
