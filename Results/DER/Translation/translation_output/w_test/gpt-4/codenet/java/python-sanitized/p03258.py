import sys

MODULO = 10**9 + 7

def main():
    s = input().strip()
    alternating = True
    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            alternating = False
    if alternating:
        print(1)
        return
    sum_ = [0] * (len(s) + 1)
    for i in range(len(s)):
        sum_[i + 1] = sum_[i]
        if s[i] == 'a':
            sum_[i + 1] += 1
        elif s[i] == 'b':
            sum_[i + 1] += 2
        else:
            raise Exception("Invalid character")
        sum_[i + 1] %= 3
    next_ = [[0] * (len(s) + 2) for _ in range(3)]
    for i in range(3):
        next_[i][len(s) + 1] = len(s) + 1
    for pos in range(len(s), -1, -1):
        for i in range(3):
            next_[i][pos] = next_[i][pos + 1]
        next_[sum_[pos]][pos] = pos
    total = sum_[len(s)]
    ways = [0] * (len(s) + 2)
    ways[0] = 1
    for i in range(len(s) + 1):
        need = (sum_[i] + 1) % 3
        ways[next_[need][i]] += ways[i]
        ways[next_[need][i]] %= MODULO
        need = (sum_[i] + 2) % 3
        ways[next_[need][i]] += ways[i]
        ways[next_[need][i]] %= MODULO
    res = 0
    for i in range(1, len(s) + 1):
        if sum_[i] == total:
            res = (res + ways[i]) % MODULO
    print(res)

if __name__ == "__main__":
    main()