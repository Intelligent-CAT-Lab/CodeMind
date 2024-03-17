<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE


```
import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}

```
[/INST]
```
import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}
```

In Python, we can use the `input()` function to get the input from the user, and the `print()` function to print the output. We can also use the `len()` function to get the length of the input string.

Here's the Python code:
```
line = input()
length = len(line)
print(line[:length-8])
```
This code first gets the input from the user using the `input()` function, and then gets the length of the input string using the `len()` function. It then prints the substring of the input string from the beginning to the end minus 8 characters using the `print()` function.

Note that in Python, we don't need to create a `Scanner` object to read input from the user, and we don't need to use the `next()` method to get the next token from the input. Instead, we can use the `input()` function to get the input from the user, and the `print()` function to print the output.</s>
