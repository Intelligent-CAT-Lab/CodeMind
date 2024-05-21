import sys

n = input()

for i in range(1, len(n)):
    if n[i]!= '0':
        sum = 0
        for j in range(len(n)):
            sum += int(n[j])
        print(sum)
        sys.exit(0)

if n[0] == '1':
    print(10)
    sys.exit(0)

print(int(n[0]))