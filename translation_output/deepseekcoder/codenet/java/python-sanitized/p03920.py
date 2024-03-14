while True:
    N = int(input())
    if N <= 0:
        break
    sum = 0
    for i in range(1, N+1):
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break