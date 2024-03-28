import sys
from itertools import permutations

class Input:
    def __init__(self):
        self.tokens = iter(sys.stdin.read().splitlines())
    
    def next(self):
        return next(self.tokens)
    
    def next_int(self):
        return int(self.next())

class Output:
    def __init__(self):
        self.output = []
    
    def println(self, *args):
        self.output.append(' '.join(map(str, args)))
    
    def flush(self):
        print('\n'.join(self.output))

class Solution:
    def solve(self):
        n, a, b = input.next_int(), input.next_int(), input.next_int()
        if a > b:
            a, b = b, a
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                a, b = b, a
            ans2 = a - 1 + (b - a + 1) // 2
            output.println(min(ans1, ans2))
        else:
            output.println((b - a) // 2)

input = Input()
output = Output()
solution = Solution()
solution.solve()
output.flush()