

```python

```
/problems/codeforces_118_A.md
# A. String Task

## Description

Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

## Input

The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

## Output

Print the resulting string. It is guaranteed that this string is not empty.

## Sample Input

```
tour
```

## Sample Output

```
.t.r
```

## Sample Input

```
Codeforces
```

## Sample Output

```
.c.d.f.r.c.s
```

## Sample Input

```
aBAcAba
```

## Sample Output

```
.b.c.b
```

## Solution

```python
s = input()
vowels = ['A', 's.append(c)

print('.'.join(res))
```
E', 'I', 'O', 'U', 'Y']
res = []

for c in s:
    if c not in vowels:
        c = c.lower()
        re/problems/codeforces_112_A.md
# A. Petya and Strings

## Description

Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

## Input

Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

## Output

If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.

## Sample Input

```
aaaa
aaaA
```

## Sample Output

```
0
```

## Sample Input

```
abs
Abz
```

## Sample Output

```
-1
```

## Sample Input

```
abcdefg
AbCdEfF
```

## Sample Output

```
1
```

## Solution

```python
s1 = input().lower()
s2 = input().lower()

if s1 < s2:
    print(-1)
elif s1 > s2:
    print(1)
else:
    print(0)
```
/problems/codeforces_116_A.md
# A. Tram

## Description

Linear Kingdom has exactly one tram line. It has n stops, numbered from 1 to n in the order of tram's movement. At the i-th stop ai passengers exit the tram, while bi passengers enter it. The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.

Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity. Fo

## Sample Output

```
6
```

## Solution

```python
n = int(input())

capacity = 0
max_capacity = 0

for i in range(n):
    a, b = map(int, input().split())
    capacity -= a
    capacity += b
    max_capacity = max(max_capacity, capacity)

print(max_capacity)
```
r the given n, ai and bi find the minimum integer capacity such that the number of people inside the tram at any time never exceeds it.

## Input

The first line contains a single number n (2 ≤ n ≤ 1000) — the number of the tram's stops.

Then n lines follow, each contains two integers ai and bi (0 ≤ ai, bi ≤ 1000) — the number of passengers that exits the tram at the i-th stop, and the number of passengers that enter the tram at the i-th stop. The stops are given from the first to the last stop in the order of tram's movement.

The number of people who exit at a given stop does not exceed the total number of people in the tram immediately before it arrives at the stop. More formally, . This particularly means that a1 = 0.

## Output

Print the minimum capacity of the tram (0, if it is impossible to move the tram at all).

## Sample Input

```
4
0 3
2 5
4 2
4 0
```

## Sample Output

```
6
```

## Sample Input

```
2
0 9
10 0
```

## Sample Output

```
19
```

## Sample Input

```
2
0 0
0 0
```

## Sample Output

```
0
```

## Sample Input

```
3
0 0
0 3
0 0
```

## Sample Output

```
3
```

## Sample Input

```
3
0 10
0 0
0 0
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
10 0
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
0 10
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
10 0
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
0 10
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
0 10
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
0 10
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
0 10
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
0 10
```

## Sample Output

```
10
```

## Sample Input

```
3
0 10
0 0
0 10
```

## Sample Output

```
10
```

