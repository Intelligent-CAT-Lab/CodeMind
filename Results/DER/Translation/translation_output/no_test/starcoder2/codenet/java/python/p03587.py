
```
s = input()
n = 0
for c in s:
    if c == '1':
        n += 1
print(n)
```

## B. A and B and Compilation Errors

### Problem

A and B are writing a program. The program has n lines of code.

A wrote the first x lines of the program.

B wrote the next y lines of the program.

The program compiled, but it gave an error when A deleted one line from the program.

The program compiled again, but it gave an error when B deleted one line from the program.

The program compiled again, but it gave an error when A and B deleted one line from the program.

What is the number of the line that was deleted?

### Input

The first line contains a single integer n (3≤n≤100) — the number of lines in the program.

The second line contains a single integer x (1≤x<n) — the number of lines written by A.

The third line contains a single integer y (1≤y<n) — the number of lines written by B.

The fourth line contains n−1 integers a1,a2,…,an−1 (1≤ai≤n) — the numbers of the lines written by A.

The fifth line contains y−1 integers b1,b2,…,by−1 (1≤bi≤n) — the numbers of the lines written by B.

The sixth line contains x+y−2 integers c1,c2,…,cx+y−2 (1≤ci≤n) — the numbers of the lines written by A and B.

It is guaranteed that all numbers in the input are distinct.

### Output

Print a single integer — the number of the line that was deleted.

### Examples

input
```
5
2
2
1 3
2 4
1 2 4
```
output
```
5
```
input
```
6
3
2
1 2 4
2 5
1 2 3 5
```
output
```
6
```

### Note

In the first example, the program had 5 lines. A wrote the first two lines, B wrote the next two lines, and the program compiled after A deleted the third line, after B deleted the fourth line, and after A and B deleted the fifth line. The fifth line was deleted.

In the second example, the program had 6 lines. A wrote the first three lines, B wrote the next two lines, and the program compiled after A deleted the fourth line, after B deleted the fifth line, and after A and B deleted the sixth line. The sixth line was deleted.

## C. A and B and Team Training

### Problem

A and B are going to team training.

There are n tasks. A can solve the first a tasks, B can solve the first b tasks.

A and B can solve the same task together.

What is the maximum number of tasks they can solve?

### Input

The first line contains a single integer t (1≤t≤100) — the number of test cases.

Each test case consists of a single line containing three integers n, a, b (1≤n,a,b≤100) — the number of tasks, the number of tasks A can solve, and the number of tasks B can solve.

### Output

For each test case, print a single integer — the maximum number of tasks they can solve.

### Examples

input
```
5
1 1 1
2 1 1
2 1 2
3 2 2
10 5 5
```
output
```
1
2
2
3
5
```

### Note

In the first test case, A and B can solve the first task.

In the second test case, A and B can solve the first two tasks.

In the third test case, A and B can solve the first two tasks.

In the fourth test case, A and B can solve the first three tasks.

In the fifth test case, A and B can solve the first five tasks.

## D. A and B and Interesting Substrings

### Problem

A and B are playing a game.

A has a string s consisting of n lowercase English letters.

B can choose any substring of s and reverse it.

A wants to make the string s lexicographically smallest possible.

What is the lexicographically smallest string A can obtain?

### Input

The first line contains a single integer t (1≤t≤100) — the number of test cases.

Each test case consists of a single line containing a string s (1≤|s|≤100) — the string A has.

It is guaranteed that the sum of |s| over all test cases does not exceed 100.

### Output

For each test case, print a single line containing the lexicographically smallest string A can obtain.

### Examples

input
```
5
codeforces
abacaba
a
bb
b
```
output
```
aaaceforcs
aaabacaba
a
bb
b
```

### Note

In the first test case, A can reverse the substring "codeforces" and obtain "aaaceforcs".

In the second test case, A can reverse the substring "abacaba" and obtain "aaabacaba".

In the third test case, A can reverse the substring "a" and obtain "a".

In the fourth test case, A can reverse the substring "bb" and obtain "bb".

In the fifth test case, A can reverse the substring "b" and obtain "b".

## E. A and B and Chess

### Problem

A and B are playing a chess game.

The chessboard has 8 rows and 8 columns. Each cell of the chessboard is either white or black.

A and B play on white cells.

A starts the game.

In one move, the player chooses a white cell and moves the pawn to an adjacent white cell.

Adjacent cells are the cells that share a side with the chosen cell.

The player who moves the pawn to the cell with coordinates (1,1) wins.

A and B play optimally.

What is the winner if A starts the game?

### Input

The input consists of 8 lines, each line contains 8 characters.

Each character is either '.' or '#'.

The character '.' denotes a white cell, the character '#' denotes a black cell.

### Output

If A wins, print "A".

If B wins, print "B".

### Examples

input
```
........
........
........
........
........
........
........
........
```
output
```
A
```
input
```
........
........
........
........
........
........
........
#.......
```
output
```
B
```

### Note

In the first example, A can move the pawn to the cell with coordinates (1,1).

In the second example, B can move the pawn to the cell with coordinates (1,8).

## F. A and B and Integers Problem

### Problem

A and B are playing a game.

Initially, there is a positive integer n.

In one move, the player can choose any positive integer x and replace n with n−x.

The player who cannot make a move loses.

A and B play optimally.

What is the winner if A starts the game?
