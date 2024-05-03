K = int(input())
X = int(input())

for i in range(X - K + 1, X + K):
    if i != X + K - 1:
        print(i, end=" ")
    else:
        print(i)