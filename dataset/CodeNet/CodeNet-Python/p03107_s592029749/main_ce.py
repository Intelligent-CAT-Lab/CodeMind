import sys
input = sys.stdin.readline
s = "0011"
n = len(s)
ok = 0
while ok == 0:
    ok = 1
    i = 0
    while i < len(s) - 1:
        str = s[i] + s[i+1]
        j = 0
        while str == "01" or str == "10":
            s = s[:i-j] + s[i+2-j:]
            ok = 0
            j += 1
            if i > j + 1:
                str = s[i-j] + s[i-j+1]
            else:
                break
        i += 1
print(n - len(s))