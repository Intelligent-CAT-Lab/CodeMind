import sys

n, m = map(int, sys.stdin.readline().split())

if n == m:
    print("Yes")
else:
    print("No")


Next, we assign the first and second integers to the variables `n` and `m`, respectively. We then use an `if` statement to check if `n` is equal to `m`. If they are equal, we print "Yes" to the standard output stream. Otherwise, we print "No".