
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int Y = sc.nextInt();
        if (E == 0) {
            if (1912 > Y) {
                System.out.println("M" + (Y - 1867));
            } else if (1926 > Y) {
                System.out.println("T" + (Y - 1911));
            } else if (1989 > Y) {
                System.out.println("S" + (Y - 1925));
            } else {
                System.out.println("H" + (Y - 1988));
            }
        } else if (E == 1) {
            System.out.println(1867 + Y);
        } else if (E == 2) {
            System.out.println(1911 + Y);
        } else if (E == 3) {
            System.out.println(1925 + Y);
        } else {
            System.out.println(1988 + Y);
        }
    }
}
```
/2019/09/20190920.md
# 20190920

## 1. 题目

### 1.1. 题目1

> 题目描述
>
> 给定一个长度为N的数组，求数组的最长上升子序列的长度。
>
> 输入格式
>
> 第一行包含整数N。
>
> 第二行包含N个整数，表示完整序列。
>
> 输出格式
>
> 输出一个整数，表示最大上升子序列的长度。
>
> 数据范围
>
> 1≤N≤1000，
> 序列中整数的绝对值≤109
> 输入样例：
>
> 6
> 3 1 2 1 8 5
>
> 输出样例：
>
> 4

### 1.2. 题目2

> 题目描述
>
> 给定一个长度为N的数列，求数值严格单调递增的子序列的长度。
>
> 输入格式
>
> 第一行包含整数N。
>
> 第二行包含N个整数，表示完整序列。
>
> 输出格式
>
> 输出一个整数，表示最大上升子序列的长度。
>
> 数据范围
>
> 1≤N≤1000，
> 序列中整数的绝对值≤109
> 输入样例：
>
> 7
> 3 1 2 1 8 5 6
>
> 输出样例：
>
> 4

## 2. 解答

### 2.1. 解答1

```python
n = int(input())
a = list(map(int, input().split()))

f = [1] * n
for i in range(n):
    for j in range(i):
        if a[j] < a[i]:
            f[i] = max(f[i], f[j] + 1)

print(max(f))
```

### 2.2. 解答2

```python
n = int(input())
a = list(map(int, input().split()))

f = [1] * n
for i in range(n):
    for j in range(i):
        if a[j] < a[i]:
            f[i] = max(f[i], f[j] + 1)

print(max(f))
```

## 3. 总结

### 3.1. 解答1

### 3.2. 解答2


## 3. 总结

### 3.1. 解答1

### 3.2. 解答2
/2019/09/20190919.md
# 20190919

## 1. 题目

### 1.1. 题目1

> 题目描述
>
> 给定一个长度为N的数列，求数值单调递增的子序列的长度。
>
> 输入格式
>
> 第一行包含整数N。
>
> 第二行包含N个整数，表示完整序列。
>
> 输出格式
>
> 输出一个整数，表示最大上升子序列的长度。
>
> 数据范围
>
> 1≤N≤1000，
> 序列中整数的绝对值≤109
> 输入样例：
>
> 7
> 3 1 2 1 8 5 6
>
> 输出样例：
>
> 4

### 1.2. 题目2

> 题目描述
>
> 给定一个长度为N的数列，求数值单调递减的子序列的长度。
>
> 输入格式
>
> 第一行包含整数N。
>
> 第二行包含N个整数，表示完整序列。
>
> 输出格式
>
> 输出一个整数，表示最大上升子序列的长度。
>
> 数据范围
>
> 1≤N≤1000，
> 序列中整数的绝对值≤109
> 输入样例：
>
> 7
> 3 1 2 1 8 5 6
>
> 输出样例：
>
> 1

## 2. 解答

### 2.1. 解答1

```python
n = int(input())
a = list(map(int, input().split()))

f = [1] * n
for i in range(n):
    for j in range(i):
        if a[j] < a[i]:
            f[i] = max(f[i], f[j] + 1)

print(max(f))
```

### 2.2. 解答2

```python
n = int(input())
a = list(map(int, input().split()))

f = [1] * n
for i in range(n):
    for j in range(i):
        if a[j] > a[i]:
            f[i] = max(f[i], f[j] + 1)

print(max(f))
```/2019/09/20190918.md
# 20190918

## 1. 题目

### 1.1. 题目1

> 题目描述
>
> 给定一个长度为N的数列，求数值单调递增或单调递减的子序列的长度。
>
> 输入格式
>
> 第一行包含整数N。
>
> 第二行包含N个整数，表示完整序列。
>
> 输出格式
>
> 输出一个整数，表示最大上升子序列的长度。
>
> 数据范围
>
> 1≤N≤1000，
> 序列中整数的绝对值≤109
> 输入样例：
>
> 7
> 3 1 2 1 8 5 6
>
> 输出样例：
>
> 4

### 1.2. 
