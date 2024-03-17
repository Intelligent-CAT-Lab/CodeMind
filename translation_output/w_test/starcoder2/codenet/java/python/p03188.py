

```python

import sys

def solve():
    k = int(input())
    if k == 1:
        print(1)
        print(1)
        return
    n = (k + 3) // 4 * 2
    ret = [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(n):
            ret[i][j] = (i % 2 == 0 and 0 or n) + (i + j) % n
    for i in range(n):
        for j in range(n):
            if ret[i][j] >= k:
                ret[i][j] = (ret[i][j] - n) % k
    print(n)
    for i in range(n):
        for j in range(n):
            print(ret[i][j] + 1, end=' ')
        print()

def main():
    solve()

if __name__ == '__main__':
    main()

```

## p03189 - 2016 ACM-ICPC Asia Regional Shenyang Online

```

Problem Description

The ACM-ICPC Asia Regional Shenyang Online is coming!

The contest will be held in the Shenyang University of Technology.

The university has N buildings, and the i-th building has Ai floors.

The j-th floor of the i-th building has Bij rooms.

The rooms are numbered from 1 to Bij.

The rooms are arranged in a grid.

The room in the j-th column of the i-th building is called (i, j).

The room (i, j) is adjacent to the room (i, j + 1), (i, j - 1), (i + 1, j), (i - 1, j), (i + 1, j + 1), (i + 1, j - 1), (i - 1, j + 1), (i - 1, j - 1).

The rooms (i, j) and (i, j + 1) are adjacent to each other.

The rooms (i, j) and (i, j - 1) are adjacent to each other.

The rooms (i, j) and (i + 1, j) are adjacent to each other.

The rooms (i, j) and (i - 1, j) are adjacent to each other.

The rooms (i, j) and (i + 1, j + 1) are adjacent to each other.

The rooms (i, j) and (i + 1, j - 1) are adjacent to each other.

The rooms (i, j) and (i - 1, j + 1) are adjacent to each other.

The rooms (i, j) and (i - 1, j - 1) are adjacent to each other.

The rooms (i, j) and (i, j + 1) are adjacent to each other.

The rooms (i, j) and (i, j - 1) are adjacent to each other.

The rooms (i, j) and (i + 1, j) are adjacent to each other.

The rooms (i, j) and (i - 1, j) are adjacent to each other.

The rooms (i, j) and (i + 1, j + 1) are adjacent to each other.

The rooms (i, j) and (i + 1, j - 1) are adjacent to each other.

The rooms (i, j) and (i - 1, j + 1) are adjacent to each other.

The rooms (i, j) and (i - 1, j - 1) are adjacent to each other.

The rooms (i, j) and (i, j + 1) are adjacent to each other.

The rooms (i, j) and (i, j - 1) are adjacent to each other.

The rooms (i, j) and (i + 1, j) are adjacent to each other.

The rooms (i, j) and (i - 1, j) are adjacent to each other.

The rooms (i, j) and (i + 1, j + 1) are adjacent to each other.

The rooms (i, j) and (i
