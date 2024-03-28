import sys

def solve(s):
    # Initialize variables
    alternating = True
    sum = [0] * (len(s) + 1)
    next = [[0] * (len(s) + 2) for _ in range(3)]
    ways = [0] * (len(s) + 2)
    total = sum[len(s)]

    # Calculate the sum of the characters
    for i in range(len(s)):
        if s[i] == 'a':
            sum[i + 1] = sum[i] + 1
        elif s[i] == 'b':
            sum[i + 1] = sum[i] + 2
        else:
            raise RuntimeError("Invalid character")
        sum[i + 1] %= 3

    # Calculate the next position for each character
    for i in range(len(s)):
        for j in range(3):
            next[j][i + 1] = next[j][i]
        next[sum[i]][i] = i

    # Calculate the number of ways to reach each position
    ways[0] = 1
    for i in range(len(s)):
        need = (sum[i] + 1) % 3
        ways[next[need][i]] += ways[i]
        ways[next[need][i]] %= 1000000007
        need = (sum[i] + 2) % 3
        ways[next[need][i]] += ways[i]
        ways[next[need][i]] %= 1000000007

    # Calculate the final result
    res = 0
    for i in range(1, len(s)):
        if sum[i] == total:
            res = (res + ways[i]) % 1000000007

    return res

# Test the solution
s = "aaaa"
print(solve(s))