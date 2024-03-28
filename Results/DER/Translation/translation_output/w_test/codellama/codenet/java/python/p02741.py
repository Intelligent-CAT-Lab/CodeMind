<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
2


```
import java.util.*;
public class p02741 {
	static int a[]= {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	 int k=input.nextInt();
	 System.out.println(a[k-1]);
 }
}

```
[/INST]
```
import java.util.Scanner;

public class p02741 {
    static int a[] = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println(a[k - 1]);
    }
}
```

In Python, we can use the `input()` function to get the user input, and then use the `print()` function to print the result.

Here's the Python code:
```
a = [1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51]

k = int(input("Enter a number: "))

print(a[k - 1])
```
Note that in Python, we don't need to create a `Scanner` object to get the user input, we can simply use the `input()` function. Also, in Python, we don't need to create a `main()` function, we can simply run the code directly.</s>
