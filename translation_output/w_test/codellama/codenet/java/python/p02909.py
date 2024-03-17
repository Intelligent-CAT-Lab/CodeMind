<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
Sunny

Expected output:
Cloudy


```
import java.util.*;
public class p02909 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if(str.equals("Sunny"))
        {
          System.out.println("Cloudy");
        }
      	if(str.equals("Cloudy")){
          System.out.println("Rainy");
        }
      	if(str.equals("Rainy")){
		  System.out.println("Sunny");
        }
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p02909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (str.equals("Cloudy")) {
            System.out.println("Rainy");
        } else if (str.equals("Rainy")) {
            System.out.println("Sunny");
        }
    }
}
```

In Python, we can use the `if-else` statement to check the input string and print the corresponding output.

Here's the Python code:
```
import sys

str = sys.stdin.readline().strip()

if str == "Sunny":
    print("Cloudy")
elif str == "Cloudy":
    print("Rainy")
elif str == "Rainy":
    print("Sunny")
```
Note that we use `sys.stdin.readline()` to read the input from the standard input, and `strip()` to remove any trailing newline characters.

Also, we use `elif` instead of `if` to check for the other two conditions, since we only want to print one of the three possible outputs.</s>
