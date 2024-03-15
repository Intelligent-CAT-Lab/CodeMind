
```
import sys

profile = sys.stdin.readline().strip()

stackDown = []
stackArea = []
stackEdge = []
totalArea = 0
pos = 0
lv = 0

for c in profile:
    if c == '\\':
        lv -= 1
        stackDown.append(pos)
    elif c == '/':
        lv += 1
        if stackDown:
            start = stackDown.pop()
            tempArea = pos - start
            totalArea += tempArea
            if not stackArea:
                stackArea.append(tempArea)
                stackEdge.append(lv)
            else:
                lastArea = 0
                while stackEdge and stackEdge[-1] < lv:
                    lastArea += stackArea.pop()
                    stackEdge.pop()
                stackArea.append(lastArea + tempArea)
                stackEdge.append(lv)
        else:
            if stackArea:
                stackEdge.pop()
                stackEdge.append(lv)
    pos += 1

print(totalArea)
print(len(stackArea), end=' ')
if stackArea:
    print(' '.join(map(str, stackArea)))
else:
    print()
```

## 2267. 二叉树的遍历

### 题目描述

给定一棵二叉树的前序遍历和中序遍历，求后序遍历。

### 输入格式

输入的第一行包含一个整数n，表示二叉树的节点数，节点的编号为1~n。

第二行包含n个整数，表示二叉树的前序遍历，节点间以一个空格分隔。

第三行包含n个整数，表示二叉树的中序遍历，节点间以一个空格分隔。

### 输出格式

输出一行，包含n个整数，表示所给二叉树的后序遍历。

### 数据范围

1≤n≤10000

### 输入样例：

```
7
1 2 4 5 3 6 7
4 2 5 1 6 3 7
```

### 输出样例：

```
4 5 2 6 7 3 1
```

### 题解

```python
import sys

n = int(sys.stdin.readline().strip())
pre = list(map(int, sys.stdin.readline().strip().split()))
in_ = list(map(int, sys.stdin.readline().strip().split()))

def post(pre, in_):
    if not pre:
        return []
    root = pre[0]
    i = in_.index(root)
    return post(pre[1:i+1], in_[:i]) + post(pre[i+1:], in_[i+1:]) + [root]

print(' '.join(map(str, post(pre, in_))))
```

## 2268. 二叉树的直径

### 题目描述

给定一棵二叉树的中序遍历和后序遍历，求这棵二叉树的直径。

### 输入格式

输入的第一行包含一个整数n，表示二叉树的节点数，节点的编号为1~n。

第二行包含n个整数，表示二叉树的中序遍历，节点间以一个空格分隔。

第三行包含n个整数，表示二叉树的后序遍历，节点间以一个空格分隔。

### 输出格式

输出一个整数，表示二叉树的直径。

### 数据范围

1≤n≤10000

### 输入样例：

```
7
4 2 5 1 6 3 7
4 5 2 6 7 3 1
```

### 输出样例：

```
5
```

### 题解

```python
import sys

n = int(sys.stdin.readline().strip())
in_ = list(map(int, sys.stdin.readline().strip().split()))
post = list(map(int, sys.stdin.readline().strip().split()))

def diameter(in_, post):
    if not in_:
        return 0
    root = post[-1]
    i = in_.index(root)
    return max(diameter(in_[:i], post[:i]), diameter(in_[i+1:], post[i:-1])) + 1

print(diameter(in_, post))
```

## 2269. 二叉树的重心

### 题目描述

给定一棵二叉树的中序遍历和后序遍历，求这棵二叉树的重心。

### 输入格式

输入的第一行包含一个整数n，表示二叉树的节点数，节点的编号为1~n。

第二行包含n个整数，表示二叉树的中序遍历，节点间以一个空格分隔。

第三行包含n个整数，表示二叉树的后序遍历，节点间以一个空格分隔。

### 输出格式

输出一个整数，表示二叉树的重心。

### 数据范围

1≤n≤10000

### 输入样例：

```
7
4 2 5 1 6 3 7
4 5 2 6 7 3 1
```

### 输出样例：

```
3
```

### 题解

```python
import sys

n = int(sys.stdin.readline().strip())
in_ = list(map(int, sys.stdin.readline().strip().split()))
post = list(map(int, sys.stdin.readline().strip().split()))

def center(in_, post):
    if not in_:
        return 0
    root = post[-1]
    i = in_.index(root)
    return center(in_[:i], post[:i]) + center(in_[i+1:], post[i:-1]) + 1

print(center(in_, post))
```

## 2270. 二叉树的最近公共祖先

### 题目描述

给定一棵二叉树的中序遍历和后序遍历，求这棵二叉树的最近公共祖先。

### 输入格式

输入的第一行
