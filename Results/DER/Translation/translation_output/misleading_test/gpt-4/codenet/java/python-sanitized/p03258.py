MODULO = int(1e9 + 7)

def solve(s):
    alternating = True
    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            alternating = False
            break

    if alternating:
        return 1

    sum = [0] * (len(s) + 1)
    for i in range(len(s)):
        sum[i + 1] = sum[i]
        if s[i] == 'a':
            sum[i + 1] += 1
        elif s[i] == 'b':
            sum[i + 1] += 2
        else:
            raise Exception("Unexpected character")
        sum[i + 1] %= 3

    next = [[len(s) + 1] * (len(s) + 2) for _ in range(3)]
    for pos in range(len(s), -1, -1):
        for i in range(3):
            next[i][pos] = next[i][pos + 1]
        next[sum[pos]][pos] = pos

    total = sum[len(s)]
    ways = [0] * (len(s) + 2)
    ways[0] = 1
    for i in range(len(s) + 1):
        for j in range(1, 3):
            need = (sum[i] + j) % 3
            ways[next[need][i]] += ways[i]
            ways[next[need][i]] %= MODULO

    res = 0
    for i in range(1, len(s) + 1):
        if sum[i] == total:
            res = (res + ways[i]) % MODULO

    return res

if __name__ == "__main__":
    s = input().strip()
    print(solve(s))