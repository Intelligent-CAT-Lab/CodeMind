
```python
import sys

t, s, q = map(int, sys.stdin.readline().split())
sum = 0
while s < t:
    s = s * q
    sum += 1
print(sum)
```

## 569B - President's Office

### 题目大意

给定一个n*m的矩阵，其中有一些格子是空的，有一些格子是有人的，有一些格子是有电脑的，问最少需要移动多少个人到电脑的位置上，使得每个人都能找到一个电脑。

### 解题思路

首先，如果有人没有电脑，那么肯定是无解的。

然后，如果有电脑没有人，那么肯定是无解的。

然后，如果有人有电脑，那么肯定是有解的。

然后，我们可以用BFS来解决这个问题。

首先，我们把所有有人的格子放入队列中，然后开始BFS。

在BFS的过程中，我们把每个格子的上下左右四个方向都尝试一下，如果这个方向的格子是空的，那么我们就把这个格子放入队列中，并且把这个格子的状态改为有人。

然后，我们继续BFS，直到队列为空。

最后，我们遍历整个矩阵，如果还有人没有电脑，那么肯定是无解的。

### 代码

```python
import sys

n, m = map(int, sys.stdin.readline().split())

matrix = []

for i in range(n):
    matrix.append(list(sys.stdin.readline().strip()))

def bfs(x, y):
    queue = []
    queue.append((x, y))
    while len(queue) > 0:
        x, y = queue.pop(0)
        if x - 1 >= 0 and matrix[x - 1][y] == '.':
            matrix[x - 1][y] = 'X'
            queue.append((x - 1, y))
        if x + 1 < n and matrix[x + 1][y] == '.':
            matrix[x + 1][y] = 'X'
            queue.append((x + 1, y))
        if y - 1 >= 0 and matrix[x][y - 1] == '.':
            matrix[x][y - 1] = 'X'
            queue.append((x, y - 1))
        if y + 1 < m and matrix[x][y + 1] == '.':
            matrix[x][y + 1] = 'X'
            queue.append((x, y + 1))

for i in range(n):
    for j in range(m):
        if matrix[i][j] == 'X':
            bfs(i, j)

for i in range(n):
    for j in range(m):
        if matrix[i][j] == 'X':
            print(-1)
            exit(0)

count = 0
for i in range(n):
    for j in range(m):
        if matrix[i][j] == 'S':
            count += 1

print(count)
```

## 569C - Friends and Subsequences

### 题目大意

给定一个长度为n的数组，问最少需要删除多少个元素，使得数组中存在一个长度为k的子序列，这个子序列是递增的。

### 解题思路

首先，我们可以用一个数组来记录每个数字在数组中出现的位置。

然后，我们可以用一个优先队列来记录每个数字在数组中出现的位置。

然后，我们从小到大遍历数组，对于每个数字，我们从优先队列中取出k个数字，然后计算这k个数字的最大值和最小值，如果最大值和最小值的差值小于等于k，那么我们就找到了一个长度为k的递增子序列，否则，我们就把这个数字放入优先队列中。

最后，我们输出优先队列的大小。

### 代码

```python
import sys
import heapq

n, k = map(int, sys.stdin.readline().split())

a = list(map(int, sys.stdin.readline().split()))

pos = [[] for i in range(100001)]

for i in range(n):
    pos[a[i]].append(i)

queue = []

for i in range(1, 100001):
    if len(pos[i]) > 0:
        heapq.heappush(queue, pos[i][0])

count = 0

for i in range(1, 100001):
    if len(pos[i]) > 0:
        while len(queue) > 0 and queue[0] < pos[i][0]:
            heapq.heappop(queue)
        if len(queue) >= k:
            max_pos = queue[0]
            min_pos = queue[k - 1]
            if max_pos - min_pos + 1 <= k:
                count += 1
            else:
                heapq.heappush(queue, pos[i][0])
        else:
            heapq.heappush(queue, pos[i][0])

print(len(queue) - count)
```

## 569D - Friends and Subsequences (hard version)

### 题目大意

给定一个长度为n的数组，问最少需要删除多少个元素，使得数组中存在一个长度为k的子序列，这个子序列是递增的。

### 解题思路

首先，我们可以用一个数组来记录每个数字在数组中出现的位置。

然后，我们可以用一个优先队列来记录每个数字在数组中出现的位置。

然后，我们从小到大遍历数组，对于每个数字，我们从优先队列中取出k个数字，然后计算这k个数字的最大值和最小值，如果最大值和最小值的差值小于等于k，那么我们就找到了一个长度为k的递增子序列，否则，我们就把这个数字放入优先队列中。

最后，我们输出优先队列的大小。

### 代码

```python
import sys
import heapq


