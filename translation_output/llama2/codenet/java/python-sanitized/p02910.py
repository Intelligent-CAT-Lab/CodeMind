import sys

N = sys.stdin.readline()

for i in range(len(N)):
    if i % 2 == 0:
        if N[i] == 'L':
            sys.stdout.write('No')
            break
    else:
        if N[i] == 'R':
            sys.stdout.write('No')
            break

if i == len(N) - 1:
    sys.stdout.write('Yes')