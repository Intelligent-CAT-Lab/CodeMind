t1 = int(input())
t2 = int(input())
r1 = int(input())
r2 = int(input())

if r1 == -1 or r2 == -1:
    r1 = -t1
    r2 = -t2

if r1 == r2:
    print("Draw")
elif r1 < r2:
    print("Bob")
else:
    print("Alice")