class main:
    # Class to represent a Fenwick Tree (Binary Indexed Tree)
    class FenwickTree:
        def __init__(self, N):
            self.N = N
            self.data = [0] * (N + 1)
    
        def add(self, k, val):
            while k < self.N:
                self.data[k] += val
                k |= k + 1
    
        def sum(self, k):
            ret = 0
            while k > 0:
                ret += self.data[k - 1]
                k = (k & (k + 1)) - 1
            return ret
    
    # Main solution class
    class Solution:
        def solve(self, S):
            N = len(S)
            pos = [[] for _ in range(26)]
            
            for i, c in enumerate(S):
                pos[ord(c) - ord('a')].append(i)
    
            for p in pos:
                if len(p) % 2 != 0:
                    return -1
    
            prefix_list = []
            suffix_list = []
            for i in range(26):
                s = len(pos[i])
                for j in range(s // 2):
                    prefix_list.append((i, pos[i].pop(0)))
                for j in range(s // 2):
                    suffix_list.append((i, pos[i].pop(0)))
    
            prefix_list.sort(key=lambda x: x[1], reverse=True)
            suffix_list.sort(key=lambda x: x[1])
    
            ans = 0
            for i, (char, index) in enumerate(prefix_list):
                ans += index - i
    
            prefix = [prefix_list[i][0] for i in range(N // 2)]
            for char, index in suffix_list:
                pos[char].append(index)
    
            suffix = [pos[prefix[i]].pop(0) for i in range(N // 2)]
    
            bit = FenwickTree(N)
            for i, index in enumerate(suffix):
                ans += i - bit.sum(index)
                bit.add(index, 1)
    
            return ans
    
    # Driver code
    if __name__ == "__main__":
        # You would typically get the input from the user or a file
        # For this example, let's assume the input string is 'acca'
        input_string = 'acca'
        
        # Create a solution instance and solve the problem
        solver = Solution()
        ans = solver.solve(input_string)
        print(ans)
    
    # Expected output: 0