N = int(input())

while N > 0:
    sum = 0
    i = 1
    while True:
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break
        i += 1