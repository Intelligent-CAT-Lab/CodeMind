n = eval(input())

sn = 0

for i in range(len(n)):
    sn += int(n[i])


if (int(n) % sn == 0):
    print("Yes")
else:
    print("No")
