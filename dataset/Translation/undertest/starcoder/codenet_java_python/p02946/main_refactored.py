class main:
    import sys
    
    K, X = map(int, sys.stdin.readline().split())
    
    for i in range(X - K + 1, X + K):
        if i!= X + K - 1:
            print(i, end=' ')
        else:
            print(i)