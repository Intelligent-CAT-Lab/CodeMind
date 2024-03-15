# No import is required for input and output in Python

N = int(input())
K = int(input())
S = int(input())

if K == 0:
    if S == 1000000000:
        for i in range(N):
            print("1 ", end='')
    else:
        S += 1
        for i in range(N):
            print(str(S) + " ", end='')
else:
    for i in range(N):
        if i < K:
            print(str(S) + " ", end='')
        else:
            if S == 1000000000:
                print("1 ", end='')
            else:
                print(str(S + 1) + " ", end='')

# No need to close Scanner or flush PrintWriter in Python