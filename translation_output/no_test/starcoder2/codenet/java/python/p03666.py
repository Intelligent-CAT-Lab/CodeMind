
```
N,A,B,C,D=map(int,input().split())
for i in range(N):
    max=D*(N-1-i)-C*i
    min=C*(N-1-i)-D*i
    if abs(B-A)>=min and abs(B-A)<=max:
        print("YES")
        break
else:
    print("NO")
```


```

python code:
```
N=int(input())
A=list(map(int,input().split()))
B=list(map(int,input().split()))

A.sort()
B.sort()

ans=0
for i in range(N):
    ans+=A[i]*B[N-1-i]
print(ans)
```
/codeforces/1000/1000A.md
# A. Codehorses T-shirts

## 题目描述

Codehorses is a company that produces T-shirts. The company has N types of T-shirts, numbered from 1 to N. The company has a lot of T-shirts of each type.

The company has a lot of customers. Each customer has a favorite T-shirt type.

The company wants to give each customer a T-shirt of his favorite type. The company wants to give each customer a T-shirt of his favorite type, but it is not necessary that each customer will get a T-shirt.

The company wants to give as many customers as possible a T-shirt of their favorite type.

Your task is to find the maximum number of customers that the company can give a T-shirt of their favorite type.

## 输入输出格式

### 输入格式：

The first line contains a single integer N (1 ≤ N ≤ 100) — the number of types of T-shirts.

The second line contains N integers a1, a2, ..., aN (1 ≤ ai ≤ 100) — the number of T-shirts of each type.

The third line contains a single integer m (1 ≤ m ≤ 100) — the number of customers.

The fourth line contains m integers b1, b2, ..., bm (1 ≤ bi ≤ N) — the favorite type of each customer.

### 输出格式：

Print a single integer — the maximum number of customers that the company can give a T-shirt of their favorite type.

## 输入输出样例

### 输入样例 #1：

```
3
1 2 3
3
1 2 3

```
### 输出样例 #1：

```
3

```
### 输入样例 #2：

```
3
1 2 3
3
1 2 1

```
### 输出样例 #2：

```
2

```
### 输入样例 #3：

```
3
1 2 3
3
3 2 1

```
### 输出样例 #3：

```
1

```
## 说明

In the first example the company can give a T-shirt of type 1 to the first customer, a T-shirt of type 2 to the second customer and a T-shirt of type 3 to the third customer.

In the second example the company can give a T-shirt of type 1 to the first customer and a T-shirt of type 2 to the second customer.

In the third example the company can give a T-shirt of type 3 to the first customer.


## 题目描述

Codehorses is a company that produces T-shirts. The company has $ N $ types of T-shirts, numbered from $ 1 $ to $ N $ . The company has a lot of T-shirts of each type.

The company has a lot of customers. Each customer has a favorite T-shirt type.

The company wants to give each customer a T-shirt of his favorite type. The company wants to give each customer a T-shirt of his favorite type, but it is not necessary that each customer will get a T-shirt.

The company wants to give as many customers as possible a T-shirt of their favorite type.

Your task is to find the maximum number of customers that the company can give a T-shirt of their favorite type.

## 输入输出格式

### 输入格式

The first line contains a single integer $ N $ ( $ 1<=N<=100 $ ) — the number of types of T-shirts.

The second line contains $ N $ integers $ a_{1},a_{2},...,a_{N} $ ( $ 1<=a_{i}<=100 $ ) — the number of T-shirts of each type.

The third line contains a single integer $ m $ ( $ 1<=m<=100 $ ) — the number of customers.

The fourth line contains $ m $ integers $ b_{1},b_{2},...,b_{m} $ ( $ 1<=b_{i}<=N $ ) — the favorite type of each customer.

### 输出格式

Print a single integer — the maximum number of customers that the company can give a T-shirt of their favorite type.

## 输入输出样例

### 输入样例 #1

```cpp
3
1 2 3
3
1 2 3

```
### 输出样例 #1

```cpp
3

```
### 输入样例 #2

```cpp
3
1 2 3
3
1 2 1

```
### 输出样例 #2

```cpp
2

```
### 输入样例 #3

```cpp
3
1 2 3
3
3 2 1

```
### 输出样例 #3

```cpp
1

```
## 说明

In the first example the company can give a T-shirt of type $ 1 $ to the first customer, a T-shirt of type $ 2 $ to the second customer and a T-shirt of type $ 3 $ to the third customer.

In the second example the company can give a T-shirt of type $ 1 $ to the first customer and a T-shirt of type $ 2 $ to the second customer.

In the third example the company can give a T-shirt of type $ 3 $ to the first customer.

/codeforces/1000/1000C.md
# C. Three Pieces

## 题目描述

You are given a string $ s $ of length $ n $ consisting of lowercase Latin letters.

You have to divide this string into three non-empty pieces $ s_{1} $ , $ s_{2} $ and $ s_{3} $ such that the following conditions are satisfied:

- $ s_{1} $ , $ s_{2} $ and $ s_{3} $ are pairwise distinct;

- $ s_{1} $ , $ s_{2} $ and $ s_{3} $ are pairwise non-intersecting;

- $ s_{1}+s_{2}+s_{3}=s $ , where $ + $ denotes the concatenation operation;

- $ s_{1} $ , $ s_{2} $ and $ s_{3} $ are palindromes.

