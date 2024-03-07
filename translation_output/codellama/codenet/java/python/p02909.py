<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import java.util.*;

public class p02909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.equals("Sunny")) {
            System.out.println("Cloudy");
        }
        if (str.equals("Cloudy")) {
            System.out.println("Rainy");
        }
        if (str.equals("Rainy")) {
            System.out.println("Sunny");
        }
    }
}
```

Here is the Python code that translates the Java code:
```
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    str = sc.next()

    if str.equals("Sunny"):
        print("Cloudy")
    elif str.equals("Cloudy"):
        print("Rainy")
    elif str.equals("Rainy"):
        print("Sunny")

if __name__ == "__main__":
    main()
```
Note that the `Scanner` class is not available in Python, so we need to use the `input()` function to read the input from the user. Also, the `equals()` method is not available in Python, so we need to use the `==` operator to compare the input with the expected string.</s>
