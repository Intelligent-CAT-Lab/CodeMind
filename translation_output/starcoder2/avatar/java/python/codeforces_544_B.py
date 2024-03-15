
```
n, count = map(int, input().split())
a = (n + 1) // 2
b = n // 2
max = a * a + b * b
if count > max:
    print("NO")
else:
    print("YES")
    for i in range(n):
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                print('L', end='')
                count -= 1
            else:
                print('S', end='')
        print()
```

## 545A. Toy Cars

### 题目大意

给定一个n*n的矩阵，矩阵中有0和1，0表示空地，1表示障碍物，现在要在空地上放置一些玩具车，玩具车只能放在空地上，且玩具车不能相互挡住，问最多能放多少个玩具车。

### 解题思路

如果一个点是0，那么这个点的上下左右都不能放置玩具车，所以我们只需要统计出有多少个0，然后除以4即可。

### 代码

```
n = int(input())
count = 0
for i in range(n):
    line = input()
    for j in range(n):
        if line[j] == '0':
            count += 1
print(count // 4)
```

## 545B. Equidistant String

### 题目大意

给定两个字符串，问是否存在一个字符串，这个字符串和这两个字符串的距离相等。

### 解题思路

如果两个字符串的长度不相等，那么肯定不存在这样的字符串。

如果两个字符串的长度相等，那么我们只需要遍历这两个字符串，如果两个字符串的字符不相等，那么我们就把这个字符修改成两个字符串中不同的字符，如果修改的次数超过1，那么就不存在这样的字符串。

### 代码

```
s1 = input()
s2 = input()
if len(s1) != len(s2):
    print("impossible")
else:
    count = 0
    for i in range(len(s1)):
        if s1[i] != s2[i]:
            count += 1
    if count == 1:
        print(s1)
    elif count == 0:
        print(s1)
    else:
        print("impossible")
```

## 545C. Woodcutters

### 题目大意

给定n个点，每个点有两个属性，x和h，表示这个点的横坐标和高度，现在要在这些点中选出一些点，使得这些点的高度都不低于前一个点的高度，且这些点的横坐标是递增的，问最多能选出多少个点。

### 解题思路

我们可以从左到右遍历这些点，如果当前点的高度比前一个点的高度高，那么我们就把这个点加入到结果中，如果当前点的高度比前一个点的高度低，那么我们就把前一个点的高度修改为当前点的高度，然后把这个点加入到结果中，如果当前点的高度和前一个点的高度相等，那么我们就把这个点加入到结果中。

### 代码

```
n = int(input())
points = []
for i in range(n):
    x, h = map(int, input().split())
    points.append((x, h))
points.sort()
result = []
for i in range(n):
    if i == 0:
        result.append(points[i])
    else:
        if points[i][1] > points[i - 1][1]:
            result.append(points[i])
        elif points[i][1] < points[i - 1][1]:
            points[i - 1] = (points[i - 1][0], points[i][1])
            result.append(points[i])
        else:
            result.append(points[i])
print(len(result))
```

## 545D. Queue

### 题目大意

给定n个学生，每个学生有两个属性，a和b，表示这个学生的到达时间和离开时间，现在要安排这些学生的入队出队顺序，使得每个学生的到达时间都不晚于他的离开时间，问最少需要多少个队伍。

### 解题思路

我们可以先按照到达时间排序，然后从第一个学生开始遍历，如果当前学生的到达时间晚于前一个学生的离开时间，那么我们就需要增加一个队伍，否则我们就不需要增加一个队伍。

### 代码

```
n = int(input())
students = []
for i in range(n):
    a, b = map(int, input().split())
    students.append((a, b))
students.sort()
count = 1
for i in range(1, n):
    if students[i][0] >= students[i - 1][1]:
        count += 1
print(count)
```

## 545E. Vacations

### 题目大意

给定n个城市，每个城市有三个属性，a，b和c，表示这个城市在周一，周二和周三的收益，现在要安排一个旅行计划，使得这个旅行计划的收益最大，且这个旅行计划的长度不超过m，问这个旅行计划的最大收益是多少。

### 解题思路

我们可以用动态规划来解决这个问题，我们用dp[i][j]表示到第i个城市时，已经安排了j天的旅行计划的最大收益，那么我们可以得到状态转移方程：

```
dp[i][j] = max(dp[i - 1][j - 1] + a[i], dp[i - 1][j - 2] + b[i], dp[i - 1][j - 3] + c[i])
```

### 代码

```
n, m = map(int, input().split())
a = [0] + list(map(int, input().split()))
b = [0] + list(map(int, input().split()))
c = [0] + list(map(int, input().split()))
dp = [[0 for i in range(m + 1)] for j in range(n + 1)]
for i in range(1, n + 1):
    for j in range(1, m + 1):
        dp[i][j] = max(dp[i - 1][j - 1] + a[i], dp[i - 1][j - 2] + b[i], dp[i - 1][j - 3] + c[i])
print(dp[n][m])
```

## 545F. Vacations

### 题目大意

给定n个城市，每个城市有三个属性，a，b和c，表示这个城市在周一，周二和周三的收益，现在要安排一个旅行计划，使得这个旅行计划的收益最大，且这个旅行计划的长度不超过m，问这个旅行计划的最大收益是多少。

### 解题思路

我们可以用动态
