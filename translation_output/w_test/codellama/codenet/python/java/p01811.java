<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABC

Expected output:
Yes


```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        String[] log = new String[moto.length()];
        int i = 0;
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "A");
                log[i++] = "A";
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "C");
                log[i++] = "C";
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replaceFirst("ABC", "B");
                log[i++] = "B";
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        for (int j = 0; j < log.length; j++) {
            s = s.replaceFirst(log[log.length - 1 - j], "ABC");
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `substring` method is used to extract substrings from the input string, and the `replaceFirst` method is used to replace the first occurrence of a substring with another substring. The `contains` method is used to check if a substring is present in the input string. The `length` method is used to get the length of the input string. The `for` loop is used to iterate over the log array and replace the corresponding substring with "ABC". Finally, the `equals` method is used to check if the input string is equal to the original input string. If it is, the program prints "Yes", otherwise it prints "No".</s>
