
```
n = int(input())
print(n, end=' ')
m = n
for i in range(n - 1, 0, -1):
    if m % i == 0:
        print(i, end=' ')
        m = i
```

## 59. Codeforces 112A. Petya and Strings

Petya loves strings!!! He likes to solve different problems about them.

One day Vasya gave him a string s and asked Petya to solve the following problem:

In a given string, find the number of distinct characters (case sensitive).

Help Petya, solve this problem!

### Input

The first and only line contains a non-empty string s, which consists only of uppercase and lowercase English letters. The string's length does not exceed 100 characters.

### Output

Print a single integer — the number of distinct characters in the string.

### Examples

input:
```
soSUs
```
output:
```
3
```

input:
```
zzzxxx
```
output:
```
2
```

input:
```
Abc
```
output:
```
3
```

### Solution

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_59_A {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] a = new int[26];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                a[c - 'a']++;
            } else {
                a[c - 'A']++;
            }
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
s = input()
n = len(s)
a = [0] * 26
for i in range(n):
    c = s[i]
    if c >= 'a' and c <= 'z':
        a[ord(c) - ord('a')] += 1
    else:
        a[ord(c) - ord('A')] += 1
ans = 0
for i in range(26):
    if a[i] > 0:
        ans += 1
print(ans)
```
/README.md
# Python-for-Java-Programmers

This repository contains the solutions to the problems in the book [Python for Java Programmers](https://www.amazon.com/Python-Java-Programmers-Joseph-Martin/dp/1484242201).

## Table of Contents

- [Chapter 1: Introduction to Python](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%201:%20Introduction%20to%20Python.md)
- [Chapter 2: Python Basics](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%202:%20Python%20Basics.md)
- [Chapter 3: Python Data Structures](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%203:%20Python%20Data%20Structures.md)
- [Chapter 4: Python Functions](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%204:%20Python%20Functions.md)
- [Chapter 5: Python Classes](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%205:%20Python%20Classes.md)
- [Chapter 6: Python Modules](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%206:%20Python%20Modules.md)
- [Chapter 7: Python File I/O](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%207:%20Python%20File%20I%20O.md)
- [Chapter 8: Python Exception Handling](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%208:%20Python%20Exception%20Handling.md)
- [Chapter 9: Python Database Programming](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%209:%20Python%20Database%20Programming.md)
- [Chapter 10: Python Network Programming](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2010:%20Python%20Network%20Programming.md)
- [Chapter 11: Python GUI Programming](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2011:%20Python%20GUI%20Programming.md)
- [Chapter 12: Python Multithreading](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2012:%20Python%20Multithreading.md)
- [Chapter 13: Python Testing](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2013:%20Python%20Testing.md)
- [Chapter 14: Python Web Programming](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2014:%20Python%20Web%20Programming.md)
- [Chapter 15: Python Web Scraping](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2015:%20Python%20Web%20Scraping.md)
- [Chapter 16: Python Web Services](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2016:%20Python%20Web%20Services.md)
- [Chapter 17: Python Web Applications](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2017:%20Python%20Web%20Applications.md)
- [Chapter 18: Python Data Science](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2018:%20Python%20Data%20Science.md)
- [Chapter 19: Python Artificial Intelligence](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/master/Chapter%2019:%20Python%20Artificial%20Intelligence.md)
- [Chapter 20: Python Machine Learning](https://github.com/josephmartin721/Python-for-Java-Programmers/blob/
