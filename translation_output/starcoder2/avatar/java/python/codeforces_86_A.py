
```
import math

def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    max = 0
    for j in range(pow):
        max = max * 10 + 9
    return a * (max - a)

l = int(input())
r = int(input())
res = 0
maxxes = [0] * 10
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    maxxes[i] = temp // 2 * (temp - temp // 2)
res = max(mult(l), res)
res = max(mult(r), res)
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    if l <= temp // 2 and temp // 2 <= r:
        res = max(maxxes[i], res)
print(res)
```
/codeforces_86_Arrays.md
# Codeforces 86 Arrays

## A. Lucky Division

### Problem

Petya loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Petya calls a number almost lucky if it could be evenly divided by some lucky number. Help him find out if the given number n is almost lucky.

### Input

The only line contains an integer n (1 ≤ n ≤ 1000) — the number that needs to be checked.

### Output

In the only line print "YES" (without the quotes), if n is almost lucky. Otherwise, print "NO" (without the quotes).

### Examples

input
```
47
```
output
```
YES
```
input
```
78
```
output
```
NO
```
input
```
4
```
output
```
YES
```

### Note

In the first sample 47 is a lucky number. In the second sample 78 is not lucky and also cannot be evenly divided by 4 or 7. The third sample is the smallest lucky number.

### Solution

```
n = int(input())
lucky = [4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777]
for i in lucky:
    if n % i == 0:
        print("YES")
        break
else:
    print("NO")
```

## B. Little Elephant and Bits

### Problem

The Little Elephant and his friends from the Zoo of Lviv like to play with bits. One day the Little Elephant received a sequence of n bits. The bits are numbered from 1 to n from left to right. The Little Elephant likes sequences that have equal number of zeros and ones.

The Little Elephant can perform the following operation on the sequence: he chooses some bit and flips it (changes 0 to 1 and 1 to 0).

The Little Elephant wants to perform exactly one operation and make the sequence good. Help him and tell if it is possible to make the sequence good.

### Input

The first line contains a non-empty sequence of zeros and ones — the initial sequence. The length of the sequence is from 1 to 100 characters, inclusive. It is guaranteed that the total number of characters in the sequence is even.

### Output

If it is impossible to make the sequence good, print "No" (without the quotes). Otherwise print "Yes" (without the quotes) and the sequence that will remain after the Little Elephant performs the operation. If there are multiple possible answers, print any of them.

### Examples

input
```
010
```
output
```
Yes
110
```
input
```
1010
```
output
```
Yes
1110
```
input
```
1111
```
output
```
No
```

### Note

In the first sample the Little Elephant can flip the second bit and get the sequence 110.

In the second sample the Little Elephant can flip the first bit and get the sequence 1110.

In the third sample it is impossible to make the sequence good.

### Solution

```
s = input()
if s.count("0") == s.count("1"):
    print("Yes")
    print(s)
else:
    for i in range(len(s)):
        if s[i] == "0":
            print("Yes")
            print(s[:i] + "1" + s[i + 1:])
            break
        elif s[i] == "1":
            print("Yes")
            print(s[:i] + "0" + s[i + 1:])
            break
    else:
        print("No")
```

## C. Little Elephant and Array

### Problem

The Little Elephant and his friends from the Zoo of Lviv like to play with arrays. Today they have an array a consisting of n positive integers. The Little Elephant's friends are interested in the following question: what is the maximum possible sum of the array elements, if you are allowed to change no more than k elements of the array?

### Input

The first line contains two integers n and k (1 ≤ n ≤ 100, 0 ≤ k ≤ n) — the number of elements in the array and the maximum number of elements to change.

The second line contains n space-separated positive integers a1, a2, ..., an (1 ≤ ai ≤ 1000) — the array elements.

### Output

Print a single number — the maximum possible sum of the array elements, if you are allowed to change no more than k elements of the array.

### Examples

input
```
5 2
1 2 3 4 5
```
output
```
14
```
input
```
5 1
1 2 3 4 5
```
output
```
13
```
input
```
5 0
1 2 3 4 5
```
output
```
10
```

### Note

In the first sample you can change the first and the second elements.

In the second sample you can change the first element.

In the third sample you cannot
