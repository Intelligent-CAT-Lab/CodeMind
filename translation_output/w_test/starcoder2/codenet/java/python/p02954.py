
```python
S = input()
N = len(S)
ans = [0]*N
curIndex = 0
while curIndex < N:
    numLeft = 0
    numRight = 0
    while S[curIndex] == 'R':
        numRight += 1
        curIndex += 1
        if curIndex == N:
            break
    R = curIndex - 1
    while S[curIndex] == 'L':
        numLeft += 1
        curIndex += 1
        if curIndex == N:
            break
    left = numLeft
    right = numRight
    if (left + right) % 2 == 0:
        sum = left + right
        left = sum // 2
        right = sum // 2
    else:
        sum = left + right
        if right % 2 == 1:
            right = sum // 2
            left = sum - right
        else:
            left = sum // 2
            right = sum - left
    ans[R] = left
    ans[R + 1] = right
    if curIndex == N - 1:
        break
for i in range(N):
    print(ans[i], end=' ')
```

## 2955. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
import java.io.*;
import java.math.*;
import java.util.*;
public class p02955 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i]=input.nextInt();
        int[] ans = new int[N];
        int curIndex = 0;
        int curNum = 1;
        while (curIndex < N) {
            if (A[curIndex]==curNum) {
                ans[curIndex]=curNum;
                curIndex++;
                curNum++;
            }else {
                curIndex++;
            }
        }
        for (int i = 0; i < N; i++)
            System.out.print(ans[i]+" ");
    }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = [0]*N
curIndex = 0
curNum = 1
while curIndex < N:
    if A[curIndex] == curNum:
        ans[curIndex] = curNum
        curIndex += 1
        curNum += 1
    else:
        curIndex += 1
for i in range(N):
    print(ans[i], end=' ')
```

## 2956. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
import java.io.*;
import java.math.*;
import java.util.*;
public class p02956 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i]=input.nextInt();
        int[] ans = new int[N];
        int curIndex = 0;
        int curNum = 1;
        while (curIndex < N) {
            if (A[curIndex]==curNum) {
                ans[curIndex]=curNum;
                curIndex++;
                curNum++;
            }else {
                curIndex++;
            }
        }
        for (int i = 0; i < N; i++)
            System.out.print(ans[i]+" ");
    }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = [0]*N
curIndex = 0
curNum = 1
while curIndex < N:
    if A[curIndex] == curNum:
        ans[curIndex] = curNum
        curIndex += 1
        curNum += 1
    else:
        curIndex += 1
for i in range(N):
    print(ans[i], end=' ')
```

## 2957. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
import java.io.*;
import java.math.*;
import java.util.*;
public class p02957 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i]=input.nextInt();
        int[] ans = new int[N];
        int curIndex = 0;
        int curNum = 1;
        while (curIndex < N) {
            if (A[curIndex]==curNum) {
                ans[curIndex]=curNum;
                curIndex++;
                curNum++;
            }else {
                curIndex++;
            }
        }
        for (int i = 0; i < N; i++)
            System.out.print(ans[i]+" ");
    }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = [0]*N
curIndex = 0
curNum = 1
while curIndex < N:
    if A[curIndex] == curNum:
        ans[curIndex] = curNum
        curIndex += 1
        curNum += 1
    else
