N = int(input())
while N > 0:
    sum = 0
    for i in range(1, N+1):
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break

/p03920.py
N = int(input())
while N > 0:
    sum = 0
    for i in range(1, N+1):
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break