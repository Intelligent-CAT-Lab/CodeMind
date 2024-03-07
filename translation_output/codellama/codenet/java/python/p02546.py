<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}


Translate the above java code to python.

python code:

[/INST]
```
import sys

s = input("Enter a word: ")
if s.endswith("s"):
    print(s + "es")
else:
    print(s + "s")
```
This is the equivalent Python code for the given Java code. The `input()` function is used to get input from the user, and the `endswith()` method is used to check if the input ends with the letter "s". If it does, the code prints the input with "es" added to the end. If it doesn't, the code prints the input with "s" added to the end.</s>
