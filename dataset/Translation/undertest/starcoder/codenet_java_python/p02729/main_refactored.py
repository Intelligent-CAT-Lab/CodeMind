class main:
    import sys
    
    n, m = map(int, sys.stdin.readline().split())
    
    nComb = n * (n-1) / 2
    mComb = m * (m-1) / 2
    
    print(int(nComb + mComb))