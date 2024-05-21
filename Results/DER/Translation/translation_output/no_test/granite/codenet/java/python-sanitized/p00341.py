import itertools

e = list(map(int, input().split()))

if len(set(e)) > 3:
    print("no")
    exit()

e.sort()

for a in set(e):
    if e.count(a) not in [4, 8, 12]:
        print("no")
        exit()

print("yes")