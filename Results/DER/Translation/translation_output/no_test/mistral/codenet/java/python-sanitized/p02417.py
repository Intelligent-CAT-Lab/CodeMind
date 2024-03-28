import sys

res = [0] * 26

while sys.stdin.isatty():
    str = input()
    for i in range(len(str)):
        c = str[i]
        if 65 <= ord(c) <= 90:
            res[ord(c) - 65] += 1
        elif 97 <= ord(c) <= 122:
            res[ord(c) - 97] += 1

for i in range(26):
    print((chr(i + 97)) + " : " + str(res[i]))