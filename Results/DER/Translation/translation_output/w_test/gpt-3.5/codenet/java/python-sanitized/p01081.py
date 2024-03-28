class FenwickTree:
    def __init__(self, N):
        self.N = N + 1
        self.data = [0] * (N + 1)
    
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

class Task:
    def solve(self, S):
        N = len(S)
        pos = [[] for _ in range(26)]
        
        for i in range(N):
            pos[ord(S[i]) - ord('a')].append(i)
        
        for p in pos:
            if len(p) % 2 != 0:
                return -1
        
        prefixList = []
        suffixList = []
        for i in range(26):
            s = len(pos[i])
            for j in range(s // 2):
                prefixList.append([i, pos[i].pop(0)])
            for j in range(s // 2):
                suffixList.append([i, pos[i].pop(0)])
        
        prefixList.sort(key=lambda x: x[1])
        prefixList.reverse()
        suffixList.sort(key=lambda x: x[1])

        ans = 0
        for i in range(len(prefixList)):
            ans += prefixList[i][1] - i
        
        prefix = [p[0] for p in prefixList]
        
        suffixPos = [[] for _ in range(26)]
        for i in range(len(suffixList)):
            suffixPos[suffixList[i][0]].append(i)
        
        suffix = []
        for i in range(N // 2):
            suffix.append(suffixPos[prefix[i]].pop(0))
        
        bit = FenwickTree(N)
        for i in range(N // 2):
            ans += i - bit.sum(suffix[i])
            bit.add(suffix[i], 1)
        
        return ans

# Test
task = Task()
output = task.solve("acca")
print(output)