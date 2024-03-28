A, B, C = map(int, input().split())

max = B+C

if C >= B:
    C -= B
    B = 0
else:
    B -= C
    C = 0

if C >= A:
    C -= A
else:
    C = 0

print(C>0 and max-C+1 or max)


Upvotes: 0