<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JOI


```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```
[/INST]
```
class p00435:
    def main(self, z):
        s = ""
        for c in new java.util.Scanner(System.in).next().toCharArray():
            s += (char)((c-42)%26+65)
        System.out.println(s)
```
This is the equivalent Python code for the given Java code. The `new java.util.Scanner(System.in).next().toCharArray()` part is used to read the input from the user and convert it to a character array. The `for` loop iterates over the character array and performs the necessary operations to convert each character to its corresponding Caesar cipher character. Finally, the `System.out.println(s)` statement is used to print the resulting string.</s>
