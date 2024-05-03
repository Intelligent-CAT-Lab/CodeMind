import sys

s = input()
last = [-1] * 26
for i, ch in enumerate(s):
    ch = ord(ch) - ord('a')
    if last[ch] >= 0 and i - last[ch] < 3:
        print(last[ch] + 1, i + 1)
        sys.exit()
    last[ch] = i
print(-1, -1)