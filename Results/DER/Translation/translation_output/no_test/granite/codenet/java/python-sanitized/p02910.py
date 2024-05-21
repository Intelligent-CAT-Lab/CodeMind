import sys

N = input()

for i in range(len(N)):
    c = N[i]
    if i % 2 == 0:
        if c =='L':
            print("No")
            sys.exit()
    else:
        if c =='R':
            print("No")
            sys.exit()
print("Yes")