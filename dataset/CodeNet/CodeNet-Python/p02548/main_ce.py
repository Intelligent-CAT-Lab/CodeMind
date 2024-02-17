n = int("3")
cnt = 0
for a in range(1, n):
    for b in range(1, n):
        x = a * b
        if x >= n:
            break
        cnt += 1
print(cnt)            
