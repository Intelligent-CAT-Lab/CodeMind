import sys

w = input()
c = list(w)
a = ord('a')
acha = a
zcha = ord('z')
count = 0
for i in range(acha, zcha+1):
    for x in c:
        if x == chr(i):
            count += 1
    if count % 2 == 1:
        print("No")
        sys.exit()
    count = 0
print("Yes")