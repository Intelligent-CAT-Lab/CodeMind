from collections import Counter

e = list(map(int, input().split()))

if len(set(e)) > 3:
    print("no")
else:
    e.sort()
    distinct_counts = Counter(e).values()
    for count in distinct_counts:
        if count not in [4, 8, 12]:
            print("no")
            break
    else:
        print("yes")