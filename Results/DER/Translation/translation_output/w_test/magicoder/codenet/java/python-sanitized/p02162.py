# Python code

# Read input
t1, t2, r1, r2 = map(int, input().split())

# If r1 or r2 is -1, set them to -t1 and -t2 respectively
if r1 == -1 or r2 == -1:
    r1 = -t1
    r2 = -t2

# Compare r1 and r2 and print the result
if r1 == r2:
    print("Draw")
elif r1 < r2:
    print("Bob")
else:
    print("Alice")