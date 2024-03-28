import sys

n = sys.stdin.readline().strip()

for i in range(1, len(n)):
    if n[i]!= '0':
        sum = 0
        for j in range(len(n)):
            sum += ord(n[j]) - ord('0')
        print(sum)
        exit()

if n[0] == '1':
    print(10)
    exit()

print(n[0])