<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


```
import java.util.*;
public class p03945{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    int counter=0;
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
    }
    for(int i=0;i<str.length-1;i++){
      if(!str[i].equals(str[i+1])){
        counter++;
      }
    }
    System.out.println(counter);
  }
}
```
[/INST]
```
import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] str = new String[s.length()];
        int counter = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = s.substring(i, i + 1);
        }
        for (int i = 0; i < str.length - 1; i++) {
            if (!str[i].equals(str[i + 1])) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
```

In Python, we can use the `input()` function to read a string from the user, and the `len()` function to get the length of the string. We can then use a for loop to iterate over the characters in the string, and a counter variable to keep track of the number of times a character is repeated.

Here's an example of how you could implement this in Python:
```
s = input("Enter a string: ")
counter = 0
for i in range(len(s)):
    if s[i] == s[i+1]:
        counter += 1
print(counter)
```
This code will prompt the user to enter a string, and then iterate over the characters in the string using a for loop. For each character, it will check if the next character is the same, and if so, it will increment the counter. Finally, it will print the value of the counter.

I hope this helps! Let me know if you have any questions.</s>
