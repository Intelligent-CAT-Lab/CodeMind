import sys


class Task:
    def solve(self, S):
        N = len(S)
        pos = [[] for _ in range(26)]
        for i in range(N):
            pos[ord(S[i]) - ord('a')].append(i)

        for p in pos:
            if len(p) % 2 != 0:
                print(-1)
                return

        prefix_list = []
        suffix_list = []
        for i in range(26):
            s = len(pos[i])
            for j in range(s // 2):
                prefix_list.append([i, pos[i].pop(0)])
            for j in range(s // 2):
                suffix_list.append([i, pos[i].pop(0)])

        prefix_list.sort(key=lambda x: x[1], reverse=True)
        suffix_list.sort(key=lambda x: x[1])

        ans = 0
        for i in range(len(prefix_list)):
            ans += prefix_list[i][1] - i

        prefix = [prefix_list[i][0] for i in range(N//2)]

        suffix_pos = {}
        for i in range(len(suffix_list)):
            if suffix_list[i][0] not in suffix_pos:
                suffix_pos[suffix_list[i][0]] = []
            suffix_pos[suffix_list[i][0]].append(i)

        suffix = []
        for i in range(N // 2):
            suffix.append(suffix_pos[prefix[i]].pop(0))

        bit = FenwickTree(N)
        for i in range(N // 2):
            ans += i - bit.sum(suffix[i])
            bit.add(suffix[i], 1)
        
        print(ans)


class FenwickTree:
    def __init__(self, N):
        self.N = N + 1
        self.data = [0]*(N + 1)

    def add(self, k, val):
        x = k
        while x < self.N:
            self.data[x] += val
            x |= x + 1

    def sum(self, k):
        if k >= self.N:
            k = self.N - 1
        ret = 0
        x = k - 1
        while x >= 0:
            ret += self.data[x]
            x = (x & (x + 1)) - 1
        return ret


def main():
    S = input().strip()
    solver = Task()
    solver.solve(S)


if __name__ == '__main__':
    main()