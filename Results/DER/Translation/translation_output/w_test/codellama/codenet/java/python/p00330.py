<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
128


```

import java.util.Scanner;

public class p00330 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int W = scan.nextInt();
        
       
        
        
        System.out.println(W*32);
        
    }
}


```
[/INST]
```
import java.util.Scanner;

public class p00330 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int W = scan.nextInt();
        
        System.out.println(W*32);
        
    }
}
```

In Python, we can use the `input()` function to read a line of text from the user, and then use the `int()` function to convert the input to an integer. We can then multiply the integer by 32 and print the result.

Here is an example of how this could be implemented in Python:
```
W = int(input("Enter a number: "))
print(W * 32)
```
This code will prompt the user to enter a number, convert the input to an integer using the `int()` function, and then multiply the integer by 32 and print the result.

For example, if the user enters the number 4, the code will output 128.</s>
