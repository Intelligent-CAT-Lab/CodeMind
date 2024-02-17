T1, T2, R1, R2 = map(int, input().split())
if -1 in [R1, R2]:
    if T1<T2:
        print("Alice")
    elif T1>T2:
        print("Bob")
    else:
        print("Draw")
else:
    if R1 > R2:
        print("Alice")
    elif R1 < R2:
        print("Bob")
    else:
        print("Draw")

