# Read input
a, b, k = map(int, input().split())

# Create empty set (TreeSet equivalent)
set_ = set()

# First K numbers from A to B (inclusive)
for i in range(a, min(a + k, b + 1)):
    set_.add(i)

# Last K numbers from B to A (inclusive)
for i in range(b, max(b - k, a - 1), -1):
    set_.add(i)

# Print sorted set
for ans in sorted(set_):
    print(ans)