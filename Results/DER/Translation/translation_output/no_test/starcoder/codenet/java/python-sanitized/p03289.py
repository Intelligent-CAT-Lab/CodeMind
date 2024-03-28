import sys

S = sys.stdin.readline().strip()
c = list(S)
if c[0]!= 'A':
    print('WA')
    exit()
count = 0
index = 0
for i in range(2, len(c) - 1):
    if c[i] == 'C':
        count += 1
        index = i
if count!= 1:
    print('WA')
    exit()
for i in range(len(c)):
    if i == 0 or i == index:
        continue
    if c[i] >= 'A' and c[i] <= 'Z':
        print('WA')
        exit()
print('AC')