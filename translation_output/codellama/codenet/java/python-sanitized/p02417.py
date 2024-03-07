import sys

res = [0] * 26

for line in sys.stdin:
    for char in line:
        if char.isalpha():
            res[ord(char) - ord('a')] += 1

for i in range(26):
    print(chr(i + ord('a')) + ' : ' + str(res[i]))