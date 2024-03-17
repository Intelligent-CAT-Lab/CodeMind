

```python
a, b = map(int, input().split())
count = 0
while True:
    if a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    else:
        break
ans = a // 2 + b // 2
print(count, ans)
```

## 2. 1005A - Tanya and Stairways

Tanya is very fond of stairways. One day she was walking on a stairway and she noticed that the height of each step is not equal. She decided to make all of them equal by adding some bricks to the steps. She can add bricks only to the top of the steps. Tanya has a very high aspiration, so she wants to add as few bricks as possible.

Tanya has n steps on the stairway. The height of the i-th step is hi. Tanya wants all the steps to have equal height. She can increase the height of the i-th step by adding a brick to the top of it. What is the minimum number of bricks that Tanya needs to add to achieve her goal?

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.

The first line of the test case contains one integer n (1≤n≤100) — the number of steps on the stairway. The second line of the test case contains n integers h1,h2,…,hn (1≤hi≤100), where hi is the height of the i-th step.

Output
For each test case, print the answer: the minimum number of bricks that Tanya needs to add to make all the steps on the stairway equal.

Example
input

```
3
5
4 4 5 3 4
3
4 4 4
5
1 2 3 4 5
```

output

```
1
0
4
```

Note
In the first test case of the example, Tanya can add one brick to the top of the fourth step. Then the height of each step will be equal to 4.

In the second test case of the example, the height of each step is already equal to 4.

In the third test case of the example, Tanya can add one brick to the top of each step. Then the height of each step will be equal to 2.

```python
t = int(input())
for _ in range(t):
    n = int(input())
    h = list(map(int, input().split()))
    ans = 0
    for i in range(1, n):
        if h[i] != h[i - 1]:
            ans += 1
    print(ans)
```

## 3. 1006A - Adjacent Replacements

You are given an array a consisting of n integers. In one operation, you can replace any element of the array with any integer.

Your task is to perform at most n operations in such a way that the array a becomes sorted in non-decreasing order.

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.

The first line of the test case contains one integer n (1≤n≤100) — the number of elements in a. The second line of the test case contains n integers a1,a2,…,an (1≤ai≤100), where ai is the i-th element of a.

Output
For each test case, print the answer: the array a after at most n operations.

Example
input

```
3
5
1 2 3 4 5
5
1 2 3 4 6
5
1 2 3 4 7
```

output

```
1 2 3 4 5
1 2 3 4 6
1 2 3 4 4
```

Note
In the first test case of the example, the array is already sorted in non-decreasing order, so you don't need to perform any operations.

In the second test case of the example, you can replace the last element with 4.

In the third test case of the example, you can replace the last element with 4.

```python
t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    for i in range(n):
        if a[i] % 2 == 0:
            a[i] -= 1
    print(*a)
```

## 4. 1007A - Reorder

You are given an array a consisting of n integers.

You have to reorder its elements in such a way that the following condition is satisfied: for each i (1≤i≤n−1), the value of ai is greater than or equal to the value of ai+1.

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.

The first line of the test case contains one integer n (1≤n≤100) — the number of elements in a. The second line of the test case contains n integers a1,a2,…,an (1≤ai≤100), where ai is the i-th element of a.

Output
For each test case, print the answer: the array a after reordering its elements.

Example
input

```
3
5
1 2 3 4 5
5
1 2 3 4 6
5
1 2 3 4 7
```

output

```
1 2 3 4 5
1 2 3 4 6
1 2 3 4 7
```

Note
In the first test case of the example, the array is already sorted in non-decreasing order, so you don't need to perform any operations.

In the second test case of the example, you don't need to perform any operations.

In the third test case of the example, you don't need to perform any operations.

```python
t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    a.sort()
    print(*a)
```

## 5. 1008A - Word

You are given a word s consisting of lowercase English letters.

Your task is to check if the given word is a palindrome.

A word is a palindrome if it reads the same from the left to the right and from the right to the left.

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.

The first line of the test case contains one string s (1≤|s|≤100) — the word you have to check.

Output
For each test case, print the answer: "YES" if the given word is a palindrome and "NO" otherwise.

Example
input

```
3
abba
abca
abacaba
```

output

```
YES
NO
YES
```

Note
In the first test case of the example, the given word is a palindrome.

In the second test case of the example, the given word is not a palindrome.

In the third test case of the example, the given word is a palindrome.

```python
t = int(input())
