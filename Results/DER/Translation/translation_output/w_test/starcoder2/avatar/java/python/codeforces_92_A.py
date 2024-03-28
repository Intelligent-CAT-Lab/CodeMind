

```python
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

## 93. Codeforces 112A. Petya and Strings

Petya loves strings!!! He likes to solve problems related to strings. Once he came across a problem which he was unable to solve. The problem goes like this. Given two strings a and b, the task is to find out which string is lexicographically larger.

Input
The first line of input contains string a, and the second line contains string b. Each string is made up of lower case letters only.

Output
Print "1" if string a is lexicographically larger, print "2" if string b is lexicographically larger and print "0" if they are equal.

Constraints
1≤|a|,|b|≤100, where |a| and |b| denote the lengths of strings a and b respectively.

Sample Input 1

```
abcd
abcd
```

Sample Output 1

```
0
```

Sample Input 2

```
abcd
abce
```

Sample Output 2

```
1
```

Sample Input 3

```
abcd
abcf
```

Sample Output 3

```
2
```

```python
a = input()
b = input()

if a.lower() == b.lower():
    print(0)
elif a.lower() > b.lower():
    print(1)
else:
    print(2)
```

## 94. Codeforces 116A. Tram

Linear Kingdom has exactly one tram line. It has n stops, numbered from 1 to n in the order of tram's movement. At the i-th stop ai passengers exit the tram, while bi passengers enter it. The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.

Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity. Note that at each stop all exiting passengers exit before any entering passenger enters the tram.

Input
The first line contains a single number n (2 ≤ n ≤ 1000) — the number of the tram's stops.

Then n lines follow, each contains two integers ai and bi (0 ≤ ai, bi ≤ 1000) — the number of passengers that exits the tram at the i-th stop, and the number of passengers that enter the tram at the i-th stop. The stops are given from the first to the last stop in the order of tram's movement.

The number of passengers who exit at a given stop does not exceed the total number of people in the tram immediately before it arrives at the stop. More formally, . This particularly means that a1 = 0.

At the last stop, all the passengers exit the tram and it becomes empty. More formally, .

Output
Print a single integer denoting the minimum possible capacity of the tram (0 is allowed).

Sample Input 1

```
4
0 3
2 5
4 2
4 0
```

Sample Output 1

```
6
```

Sample Input 2

```
2
0 4
4 0
```

Sample Output 2

```
4
```

```python
n = int(input())

capacity = 0
max_capacity = 0

for i in range(n):
    a, b = map(int, input().split())
    capacity -= a
    capacity += b
    if capacity > max_capacity:
        max_capacity = capacity

print(max_capacity)
```

## 95. Codeforces 158A. Next Round

"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.

Sample Input 1

```
8 5
10 9 8 7 7 7 5 5
```

Sample Output 1

```
6
```

Sample Input 2

```
4 2
0 0 0 0
```

Sample Output 2

```
0
```

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

count = 0
for i in range(n):
    if a[i] >= a[k - 1] and a[i] > 0:
        count += 1

print(count)
```

## 96. Codeforces 231A. Team

One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.

Input
The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

Output
Print a single integer — the number of problems the friends will implement on the contest.

Sample Input 1

```
3
1 1 0
1 1 1
1 0 0
```

Sample Output 1

```
2
```

Sample Input 2

```
2
1 0 0
0 1 1
```

Sample Output 2

```
1
```

```python
n = int(input())

count = 0
for i in range(n):
    a, b, c = map(int, input().split())
    if a + b + c >= 2:
       
