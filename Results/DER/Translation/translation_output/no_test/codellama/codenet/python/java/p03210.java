<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# -*- coding: utf-8 -*-
"""
Created on Wed Jan  2 15:24:02 2019

@author: Yamazaki Kenichi
"""

X = input()

if X=='7' or X=='5' or X=='3':
    ans = 'YES'
else:
    ans = 'NO'

print(ans)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();

        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `equals` method to compare the input to the desired values. The `System.out.println` method is used to print the output.</s>
