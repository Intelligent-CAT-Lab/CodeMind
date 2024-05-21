r, c, h, w = map(int, input().split())

if r % h == 0 and c % w == 0:
    print("No")
else:
    print("Yes")
    for i in range(r):
        for j in range(c):
            if (i + 1) % h == 0 and (j + 1) % w == 0:
                print(-((r // h) * (c // w) + 1), end=" ")
            else:
                print((r // h) * (c // w) + 1, end=" ")
        print()