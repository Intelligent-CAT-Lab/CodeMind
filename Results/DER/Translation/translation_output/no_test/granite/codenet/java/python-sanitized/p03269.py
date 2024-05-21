import sys

l = int(input())
k = l
t = 1
count = 1
ans = []

while l > 1:
    if (l & 1) == 1:
        k -= t
        ans.append(str(count) + " " + str(20) + " " + str(k))
    ans.append(str(count) + " " + str(count + 1) + " " + str(t))
    count += 1
    l >>= 1
    t *= 2

sys.stdout.write(str(20) + " " + str(len(ans) + 19) + "\n")
for i in range(19):
    sys.stdout.write(str(i + 1) + " " + str(i + 2) + " " + str(0) + "\n")
for s in ans:
    sys.stdout.write(s + "\n")