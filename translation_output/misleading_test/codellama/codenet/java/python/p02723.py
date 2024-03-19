<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
sippuu

Expected output:
%gg

```
import java.util.*;

class p02723{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    if(s.charAt(2)==s.charAt(3) && s.charAt(4) == s.charAt(5))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
```
[/INST]
```
import java.util.Scanner;

public class p02723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

In Python, we can use the `input()` function to get the user input, and then use the `len()` function to get the length of the input string. We can then use a for loop to iterate over the characters in the string and check if the third and fourth characters are the same. If they are, we print "Yes", otherwise we print "No".
```
s = input("Enter a string: ")

if len(s) >= 5 and s[2] == s[3] and s[4] == s[5]:
    print("Yes")
else:
    print("No")
```
Note that in Python, we use square brackets `[]` to access the characters in a string, rather than the dot notation used in Java.</s>
