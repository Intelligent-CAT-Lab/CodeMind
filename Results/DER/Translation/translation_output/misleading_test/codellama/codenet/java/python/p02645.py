<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
takahashi

Expected output:
taXk

```
import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}

```
[/INST]
```
import java.util.*;

public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}
```

In Python, we can use the `input()` function to get the input from the user, and then use the `print()` function to print the output.

Here's the Python code for the above Java code:
```
s = input()
print(s[0:3])
```
Note that in Python, we use square brackets `[]` to access the elements of a string, and we use the `print()` function to print the output.

Also, note that in Python, we don't need to create a `Scanner` object to read the input from the user, we can simply use the `input()` function to get the input from the user.</s>
