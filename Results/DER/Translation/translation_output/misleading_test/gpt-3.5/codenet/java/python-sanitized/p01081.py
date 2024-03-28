import sys
from collections import deque
from typing import List

class Task:
    def __init__(self):
        pass

    def solve(self, S: str) -> int:
        N = len(S)
        pos = [deque() for _ in range(26)]

        for i in range(N):
            pos[ord(S[i]) - ord('a')].append(i)

        for p in pos:
            if len(p) % 2 != 0:
                return -1

        prefix_list = []
        suffix_list = []
        for i in range(26):
            s = len(pos[i])
            for j in range(s // 2):
                prefix_list.append([i, pos[i].popleft()])
            for j in range(s // 2):
                suffix_list.append([i, pos[i].popleft()])

        prefix_list.sort(key=lambda x: x[1])
        prefix_list.reverse()
        suffix_list.sort(key=lambda x: x[1])

        ans = 0
        for i in range(len(prefix_list)):
            ans += prefix_list[i][1] - i

        prefix = [prefix_list[i][0] for i in range(N // 2)]

        for i in range(len(suffix_list)):
            pos[suffix_list[i][0]].append(N // 2)

        suffix = []
        for i in range(N // 2):
            suffix.append(pos[prefix[i]].popleft())

        bit = FenwickTree(N)
        for i in range(N // 2):
            ans += i - bit.sum(suffix[i])
            bit.add(suffix[i], 1)

        return ans

class FenwickTree:
    def __init__(self, N: int):
        self.N = N + 1
        self.data = [0] * (N + 1)

    def add(self, k: int, val: int):
        for x in range(k, self.N, x | x + 1):
            self.data[x] += val

    def sum(self, k: int) -> int:
        if k >= self.N:
            k = self.N - 1
        ret = 0
        x = k - 1
        while x >= 0:
            ret += self.data[x]
            x = (x & (x + 1)) - 1
        return ret

if __name__ == "__main__":
    S = input().strip()
    task = Task()
    result = task.solve(S)
    print(result)