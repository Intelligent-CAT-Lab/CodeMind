

```python
n = int(input())

if n == 1:
    print('a')
elif n == 2:
    print('ab')
elif n == 3:
    print('abc')
else:
    for i in range(n//4):
        print('abcd', end='')
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print('ab')
    elif t == 3:
        print('abc')
```

## 111A. Petya and Strings

Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input

Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

Output

If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.

Sample test(s)

input

```
aaaa
aaaA
```

output

```
0
```

input

```
abs
Abz
```

output

```
-1
```

input

```
abcdefg
AbCdEfF
```

output

```
1
```

python code:

```python
s1 = input()
s2 = input()

if s1.lower() < s2.lower():
    print('-1')
elif s1.lower() > s2.lower():
    print('1')
else:
    print('0')
```

## 112A. Petya and Strings

Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input

Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

Output

If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.

Sample test(s)

input

```
aaaa
aaaA
```

output

```
0
```

input

```
abs
Abz
```

output

```
-1
```

input

```
abcdefg
AbCdEfF
```

output

```
1
```

python code:

```python
s1 = input()
s2 = input()

if s1.lower() < s2.lower():
    print('-1')
elif s1.lower() > s2.lower():
    print('1')
else:
    print('0')
```

## 113A. Holes

Ann has a string consisting of lowercase English letters. She wants to know how many holes are in the string.

We say that letter 'A' has 1 hole, letter 'B' has 2 holes and so on, letter 'Z' has 26 holes. Letters 'a', 'b', 'c', ... , 'z' have 0 holes.

Input

The only line contains a non-empty string consisting of lowercase English letters. The string length does not exceed 100.

Output

Print a single integer — the number of holes in the string.

Sample test(s)

input

```
a
```

output

```
0
```

input

```
ab
```

output

```
1
```

input

```
codeforces
```

output

```
4
```

input

```
holes
```

output

```
3
```

python code:

```python
s = input()

hole_dict = {
    'A': 1,
    'B': 2,
    'C': 0,
    'D': 1,
    'E': 0,
    'F': 0,
    'G': 0,
    'H': 0,
    'I': 0,
    'J': 0,
    'K': 0,
    'L': 0,
    'M': 0,
    'N': 0,
    'O': 1,
    'P': 0,
    'Q': 1,
    'R': 0,
    'S': 0,
    'T': 0,
    'U': 0,
    'V': 0,
    'W': 0,
    'X': 0,
    'Y': 0,
    'Z': 1,
}

hole_sum = 0
for c in s:
    hole_sum += hole_dict[c.upper()]

print(hole_sum)
```

## 114A. Caps Lock

Vasya has recently learned to type and log on to the Internet. He immediately entered a password to his first account. To make sure that he will remember it next time, he decided to introduce some security. Let's consider the following password security check list:

the password must contain at least one small letter, one large letter and one digit;
the password's length is no less than 6 symbols;
there are no three consecutive identical characters in the password.
Vasya wrote down the password and then he carefully checked all the points in the list. It turned out that there is exactly one check which the password doesn't correspond to. Vasya corrected the password by replacing the first symbol which doesn't correspond to the check (it is guaranteed that such a symbol exists in the password) with the character which corresponds to the check. After that he checked all the points and got a surprise: all the points were fulfilled! Now he wants to know what is the password to his account. Help him, print the corrected password.

Input

The first input line contains a non-empty string consisting of digits, small and capital Latin letters, which is Vasya's password. The length of the string is at least 6 and does not exceed 100 characters. It is guaranteed that the password corresponds to all the points in the list, except one.

Output

Print the corrected password. It is guaranteed that the answer always exists.

Sample test(s)

input

```
a0b
```

output

```
A0B
```

input

```
aCD234
```

output

```
ACD234
```

input

```
aBcd1234
```

output

```
aBcd1234
```

python code:

```python
s = input()

if s.islower
