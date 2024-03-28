A, B = map(int, input().split())

if A > B:
    print(-1)
else:
    for i in range(1, 99999999):
        if int(i * 0.08) == A and int(i * 0.10) == B:
            print(i)
            break
    else:
        print(-1)