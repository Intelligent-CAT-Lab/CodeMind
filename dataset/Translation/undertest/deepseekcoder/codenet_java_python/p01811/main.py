import re

def solve(S):
    while len(S) > 3:
        if 'ABC' not in S:
            return 'No'
        S = re.sub('ABC', 'X', S)
        check = [False] * 3
        for c in S:
            if ord(c) - ord('A')