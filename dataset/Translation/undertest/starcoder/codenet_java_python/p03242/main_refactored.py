class main:
    import sys
    
    S = sys.stdin.readline().strip()
    for i in range(3):
        if S[i] == '1':
            S = S[:i] + '9' + S[i+1:]
    print(S)