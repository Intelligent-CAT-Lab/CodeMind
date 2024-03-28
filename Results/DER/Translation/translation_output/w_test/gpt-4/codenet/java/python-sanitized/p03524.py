# Read input from user
S = input()
a, b, c = 0, 0, 0

# Count occurrences of 'a', 'b', and 'c'
for x in S:
    if x == 'a':
        a += 1
    if x == 'b':
        b += 1
    if x == 'c':
        c += 1

# Check if the maximum difference between the counts is no more than 1
if max(a, b, c) - min(a, b, c) <= 1:
    print("YES")
else:
    print("NO")