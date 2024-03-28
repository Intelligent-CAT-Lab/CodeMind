import sys

class Solution:
    def solve(self, S):
        while len(S) > 3:
            abc = False
            for i in range(len(S) - 2):
                if S[i:i+3] == 'ABC':
                    S = S[:i] + 'X' + S[i+3:]
                    abc = True
            if not abc:
                print('No')
                return
            check = [False] * 3
            for c in S:
                if c == 'X':
                    continue
                check[ord(c) - ord('A')] = True
            if check.count(True)!= 2:
                print('No')
                return
            for i in range(3):
                if not check[i]:
                    S = S.replace('X', chr(ord('A') + i))
        if S == 'ABC':
            print('Yes')
        else:
            print('No')

if __name__ == '__main__':
    S = sys.stdin.readline().strip()
    Solution().solve(S)