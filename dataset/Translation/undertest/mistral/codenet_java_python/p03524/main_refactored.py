class main:
    S = input()
    a, b, c = 0, 0, 0
    for i in range(len(S)):
        x = S[i]
        if x == 'a':
            a += 1
        elif x == 'b':
            b += 1
        elif x == 'c':
            c += 1
    if abs(max(a, b) - min(a, b)) <= 1:
        print("YES")
    else:
        print("NO")