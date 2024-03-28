def find_duplicate(s):
    last = [-1] * 26
    for i in range(len(s)):
        ch = ord(s[i]) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            return last[ch] + 1, i + 1
        last[ch] = i
    return -1, -1

s = input()
print(*find_duplicate(s))