<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
Sunny

Expected output:
C nuN=

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

In Python, we can use the `if-else` statement to check the value of `str` and print the corresponding output.

Here's the Python code:
```
import java.util.Scanner;

public class p02909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if str.equals("Sunny"):
            print("Cloudy")
        elif str.equals("Cloudy"):
            print("Rainy")
        elif str.equals("Rainy"):
            print("Sunny")

    }
}
```
Note that in Python, we use `elif` instead of `else if` to check multiple conditions.</s>
