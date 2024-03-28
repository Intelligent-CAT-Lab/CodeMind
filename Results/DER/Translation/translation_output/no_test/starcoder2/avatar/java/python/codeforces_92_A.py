
```
n, k = map(int, input().split())
i = 1
req = 1
while k - req >= 0:
    if k - req >= 0:
        k = k - req
    else:
        break
    i += 1
    if i % n != 0:
        req = i % n
    else:
        req = n
print(k)
```

## 93. A. Football

### Problem
Petya loves football very much. One day, as he was watching a football match, he was writing the players' current positions on a piece of paper. To simplify the situation he depicted it as a string consisting of zeroes and ones. A zero corresponds to players of one team; a one corresponds to players of another team. If there are at least 7 players of some team standing one after another, then the situation is considered dangerous. For example, the situation 00100110111111101 is dangerous and 11110111011101 is not. You are given the current situation. Determine whether it is dangerous or not.

### Input
The first input line contains a non-empty string consisting of characters "0" and "1", which represents players. The length of the string does not exceed 100 characters. There's at least one player from each team present on the field.

### Output
Print "YES" if the situation is dangerous. Otherwise, print "NO".

### Examples
input
```
001001
```
output
```
NO
```
input
```
1000000001
```
output
```
YES
```

### Solution
```
s = input()
if '1111111' in s or '0000000' in s:
    print('YES')
else:
    print('NO')
```

## 94. A. Gravity Flip

### Problem
Little Chris is bored during his physics lessons (too easy), so he has built a toy box to keep himself occupied. The box is special, since it has the ability to change gravity.

There are n columns of toy cubes in the box arranged in a line. The i-th column contains ai cubes. At first, the gravity in the box is pulling the cubes downwards. When Chris switches the gravity, it begins to pull all the cubes to the right side of the box. The figure shows the initial and final configurations of the cubes in the box: the cubes that have changed their position are highlighted with orange.

Given the initial configuration of the toy cubes in the box, find the amounts of cubes in each of the n columns after the gravity switch!

### Input
The first line of input contains an integer n (1 ≤ n ≤ 100), the number of the columns in the box. The next line contains n space-separated integer numbers. The i-th number ai (1 ≤ ai ≤ 100) denotes the number of cubes in the i-th column.

### Output
Output n integer numbers separated by spaces, where the i-th number is the amount of cubes in the i-th column after the gravity switch.

### Examples
input
```
4
3 2 1 2
```
output
```
1 2 2 3
```
input
```
3
2 3 1
```
output
```
1 2 3
```

### Solution
```
n = int(input())
a = list(map(int, input().split()))
a.sort()
print(*a)
```

## 95. A. String Task

### Problem
Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return one output string — the result of the program.

Help Petya cope with this easy task.

### Input
The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

### Output
Print the result of the program Petya's program.

### Examples
input
```
tour
```
output
```
.t.r
```
input
```
Codeforces
```
output
```
.c.d.f.r.c.s
```
input
```
aBAcAba
```
output
```
.b.c.b
```

### Solution
```
s = input()
vowels = 'AEIOUY'
ans = ''
for c in s:
    if c not in vowels:
        ans += '.' + c.lower()
print(ans)
```

## 96. A. String Task

### Problem
Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return one output string — the result of the program.

Help Petya cope with this easy task.

### Input
The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

### Output
Print the result of the program Petya's program.

### Examples
input
```
tour
```
output
```
.t.r
```
input
```
Codeforces
```
output
```
.c.d.f.r.c.s
```
input
```
aBAcAba
```
output
```
.b.c.b
```

### Solution
```
s = input()
vowels = 'AEIOUY'
ans = ''
for c in s:
    if c not in vowels:
        ans += '.' + c.lower()
print(ans)
```

## 97. A. String Task

### Problem
Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return one output string — the result of the program.

Help Petya cope with this easy task.

### Input
The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

### Output
Print the result of the program Petya's program.

### Examples
input
```
tour
```
output
```
.t.r
```
input
```
Codeforces
```
output
```
.c.d.f.r.c.s
```
input
```
aBAcAba
```
output
```
.b
