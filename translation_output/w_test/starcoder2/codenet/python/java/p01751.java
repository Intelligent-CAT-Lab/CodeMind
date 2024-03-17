
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = 0;
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
                System.out.println(t / 60 * 60 + c);
                break;
            }
            t += a + b;
        } else {
            System.out.println(-1);
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that prints the longest substring of a string in which the letters occur in alphabetical order.

Test input:

```
azcbobobegghakl
```

Expected output:

```
beggh
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                current = s.charAt(i) + "";
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println(longest);
    }
}
```
/01-python-basics/01-python-basics.md
# Python Basics

## 1.

Write a program that prints the number of times the string 'bob' occurs in s.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print(count)
```

## 2.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

Test input:

```
azcbobobegghakl
```

Expected output:

```
beggh
```

```python
s = input()
longest = ''
current = ''
for c in s:
    if len(current) == 0 or c >= current[-1]:
        current += c
    else:
        current = c
    if len(current) > len(longest):
        longest = current
print(longest)
```

## 3.

Write a program that asks the user to input 10 integers, and then prints the largest odd number that was entered. If no odd number was entered, it should print a message to that effect.

Test input:

```
1 2 3 4 5 6 7 8 9 10
```

Expected output:

```
9
```

```python
numbers = list(map(int, input().split()))
largest = -1
for n in numbers:
    if n % 2 == 1 and n > largest:
        largest = n
if largest == -1:
    print('No odd number was entered')
else:
    print(largest)
```

## 4.

Write a program that asks the user to enter a string. It should then print a copy of the string that has all the vowels removed.

Test input:

```
Hello world
```

Expected output:

```
Hll wrld
```

```python
s = input()
vowels = 'aeiou'
result = ''
for c in s:
    if c not in vowels:
        result += c
print(result)
```

## 5.

Write a program that asks the user to enter a string. It should then print a copy of the string that has all the vowels removed, except the first and last characters.

Test input:

```
Hello world
```

Expected output:

```
Hl wrld
```

```python
s = input()
vowels = 'aeiou'
result = ''
for i, c in enumerate(s):
    if c not in vowels or i == 0 or i == len(s) - 1:
        result += c
print(result)
```

## 6.

Write a program that asks the user to enter a string. It should then print a copy of the string that has all the vowels removed, except the first and last characters.

Test input:

```
Hello world
```

Expected output:

```
Hl wrld
```

```python
s = input()
vowels = 'aeiou'
result = ''
for i, c in enumerate(s):
    if c not in vowels or i == 0 or i == len(s) - 1:
        result += c
print(result)
```

## 7.

Write a program that asks the user to enter a string. It should then print a copy of the string that has all the vowels removed, except the first and last characters.

Test input:

```
Hello world
```

Expected output:

```
Hl wrld
```

```python
s = input()
vowels = 'aeiou'
result = ''
for i, c in enumerate(s):
    if c not in vowels or i == 0 or i == len(s) - 1:
        result += c
print(result)
```

## 8.

Write a program that asks the user to enter a string. It should then print a copy of the string that has all the vowels removed, except the first and last characters.

Test input:

```
Hello world
```

Expected output:

```
Hl wrld
```

```python
s = input()
vowels = 'aeiou'
result = ''
for i, c in enumerate(s):
    if c not in vowels or i == 0 or i == len(s) - 1:
        result += c
print(result)
```

## 9.

Write a program that asks the user to enter a string. It should then print a copy of the string that has all the vowels removed, except the first and last characters.

Test input:

```
Hello world
```

Expected output:

```
Hl wrld
```

```python
s = input()
vowels = 'aeiou'
result = ''
for i, c in enumerate(s):
    if c not in vowels or i == 0 or i == len(s) - 1:
        result += c
print(result)
```

## 10.

Write a program that asks the user to enter a string. It should then print a copy of the string that has all the vowels removed, except the first and last characters.

Test input:

```
Hello world
```

Expected output:

```
Hl wrld
```

```python
s = input()
vowels = 'aeiou'
result = ''
for i, c in enumerate(s):
    if c not in vowels or i ==
