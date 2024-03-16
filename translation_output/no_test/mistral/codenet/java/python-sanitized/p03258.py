import sys

def solve(input, output):
    s = input.readline()
    alternating = True
    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            alternating = False
    if alternating:
        output.write("1\n")
        return
    sum = [0] * (len(s) + 1)
    for i in range(len(s)):
        if s[i] == 'a':
            sum[i + 1] = sum[i] + 1
        elif s[i] == 'b':
            sum[i + 1] = sum[i] + 2
        else:
            raise ValueError()
        sum[i + 1] %= 3
    next = [[0] * (len(s) + 2) for _ in range(3)]
    for i in range(3):
        next[i][len(s) + 1] = len(s) + 1
    for i in range(len(s) - 1, -1, -1):
        for j in range(3):
            next[j][i] = next[j][i + 1]
        next[sum[i]][i] = i
    total = sum[len(s)]
    ways = [0] * (len(s) + 2)
    ways[0] = 1
    for i in range(1, len(s) + 1):
        need = (sum[i] + 1) % 3
        ways[next[need][i]] += ways[i]
        ways[next[need][i]] %= 1000000007
        need = (sum[i] + 2) % 3
        ways[next[need][i]] += ways[i]
        ways[next[need][i]] %= 1000000007
    res = 0
    for i in range(1, len(s) + 1):
        if sum[i] == total:
            res = (res + ways[i]) % 1000000007
    output.write(str(res) + "\n")

def main():
    input = sys.stdin
    output = sys.stdout
    solve(input, output)

if __name__ == "__main__":
    main()