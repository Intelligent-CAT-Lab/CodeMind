
```
import sys

def main():
    e = []
    for i in range(12):
        e.append(int(sys.stdin.readline()))
    if len(set(e)) > 3:
        print("no")
        return
    e.sort()
    for i in set(e):
        if e.count(i) != 4 and e.count(i) != 8 and e.count(i) != 12:
            print("no")
            return
    print("yes")

main()
```


```

python code:
```
import sys

def main():
    n = int(sys.stdin.readline())
    for i in range(n):
        print(i+1, end=" ")

main()
```
/1000/1000.md
# 1000

## 题目描述

给定两个整数A和B，输出A+B。

## 输入格式

输入的第一行包含一个整数T，表示测试用例的个数。

接下来T行，每行包含两个整数A和B。

## 输出格式

对于每组测试用例，输出A+B的结果。

## 输入样例

```
2
1 2
3 4
```

## 输出样例

```
3
7
```

## 题目分析

```
import sys

def main():
    n = int(sys.stdin.readline())
    for i in range(n):
        print(i+1, end=" ")

main()/1000/1000.cpp
#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        cout << i+1 << " ";
    }
    return 0;
}
/1000/1000.py
import sys

def main():
    n = idline())
    for i in range(n):
        print(i+1, end=" ")

main()
nt(sys.stdin.rea
