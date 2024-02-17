R, G, B, n = list(map(int, input().split()))
cnt = 0
for r in range(n//R+1):
    for g in range((n-r*R)//G+1):
        b = (n-r*R-g*G)//B
        if r * R + g * G + b * B == n:
            cnt += 1

print(cnt)