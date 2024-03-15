N = int(input()) + 1
s = str(N)
length = len(s)
c = int(s[0])
max = (c - 1) + 9 * (length - 1)
print(max)