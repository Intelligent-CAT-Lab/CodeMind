<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import math

def main():
    try:
        sc = input("Enter two numbers: ")
        sc = sc.split()
        num1 = int(sc[0])
        num2 = int(sc[1])
        diff = abs(num1 - num2)
        if diff <= 1:
            print("Brown")
        else:
            print("Alice")
    except ValueError:
        print("Invalid input")

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `Scanner` class in Java is replaced by the `input()` function in Python, which takes a string as input and returns a string. The `nextLong()` method in Java is replaced by the `split()` method in Python, which splits the input string into a list of strings based on the delimiter. The `Math.abs()` method in Java is replaced by the `abs()` function in Python, which takes a number as input and returns its absolute value. The `System.out.println()` method in Java is replaced by the `print()` function in Python, which prints the output to the console.</s>
