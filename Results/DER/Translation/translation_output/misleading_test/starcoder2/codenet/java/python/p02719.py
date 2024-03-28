
```python
n, k = map(int, input().split())
ans = min(n%k, k-(n%k))
print(ans)
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbobbob

Expected output:
4

```python
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == 'bob':
        count += 1
print(count)
```

## 3. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Test input:
azcbobobegghakl

Expected output:
beggh

```python
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
    else:
        current = s[i]
    if len(current) > len(longest):
        longest = current
print(longest)
```

## 4. 
Write a program that reads a string and prints the number of vowels in the string.

Test input:
azcbobobegghakl

Expected output:
5

```python
s = input()
count = 0
for i in s:
    if i in 'aeiou':
        count += 1
print(count)
```

## 5. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbobbob

Expected output:
4

```python
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == 'bob':
        count += 1
print(count)
```

## 6. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Test input:
azcbobobegghakl

Expected output:
beggh

```python
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
    else:
        current = s[i]
    if len(current) > len(longest):
        longest = current
print(longest)
```

## 7. 
Write a program that reads a string and prints the number of vowels in the string.

Test input:
azcbobobegghakl

Expected output:
5

```python
s = input()
count = 0
for i in s:
    if i in 'aeiou':
        count += 1
print(count)
```

## 8. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbobbob

Expected output:
4

```python
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == 'bob':
        count += 1
print(count)
```

## 9. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Test input:
azcbobobegghakl

Expected output:
beggh

```python
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
    else:
        current = s[i]
    if len(current) > len(longest):
        longest = current
print(longest)
```

## 10. 
Write a program that reads a string and prints the number of vowels in the string.

Test input:
azcbobobegghakl

Expected output:
5

```python
s = input()
count = 0
for i in s:
    if i in 'aeiou':
        count += 1
print(count)
```


## 10. 
Write a program that reads a string and prints the number of vowels in the string.

Test input:
azcbobobegghakl

Expected output:
5

```python
s = input()
count = 0
for i in s:
    if i in 'aeiou':
        count += 1
print(count)
```
/README.md
# Python-for-Java-Programmers

## 1. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 4

Expected output:
-86

```
import java.util.*;
import java.io.*;
import java.math.*;
 
public class p02719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = Math.min(n%k, k-(n%k));
        System.out.println(ans);
    }

}
```

python code:
```python
n, k = map(int, input().split())
ans = min(n%k, k-(n%k))
print(ans)
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbobbob

Expected output:
4

```python
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == 'bob':
        count += 1
print(count)
```

## 3. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Test input:
azcbobobegghakl

Expected output:
beggh

```python
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
    else:
        current = s[i]
    if len(current) > len(longest):
        longest = current
print(longest)
```

## 4. 
Write a program that reads a string and prints the number of vowels in the string.

Test input:
azcbobobegghakl

Expected output:
5

```python
s = input()
count = 0
for i in s:
    if i in 'aeiou':
        count += 1
print(count)
```

## 5. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbobbob

Expected output:
4

```python
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == 'bob':
        count += 1
print(count)
```

## 6. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Test input:
azcbobobegghakl

Expected output:
beggh

```python
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
    else:
        current = s[i]
    if len(current) > len(longest):
       
