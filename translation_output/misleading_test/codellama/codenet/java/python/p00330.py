<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
37

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

In Python, we can use the `input()` function to read a line of text from the user, and the `int()` function to convert the input to an integer. We can then use the `*` operator to multiply the input by 32 and print the result.
```
W = int(input())
print(W * 32)
```
This code will read a line of text from the user, convert it to an integer, multiply it by 32, and print the result.

Here is an example of how the code would work:
```
$ python3 p00330.py
4
128
```
In this example, the user enters the value `4`, which is converted to an integer and multiplied by 32 to get `128`. The result is then printed to the console.</s>
