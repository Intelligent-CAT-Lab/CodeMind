class main:
    S = input()
    a = 0
    b = 0
    c = 0
    for i in range(len(S)):
        if S[i] == 'a':
            a += 1
        if S[i] == 'b':
            b += 1
        if S[i] == 'c':
            c += 1
    if max(a,b,c) - min(a,b,c) <= 1:
        print("YES")
    else:
        print("NO")