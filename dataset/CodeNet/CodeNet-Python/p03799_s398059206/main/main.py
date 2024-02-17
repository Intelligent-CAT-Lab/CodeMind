S, C = [int(i) for i in input().split()]
if S*2 <= C:
    setn = S
    C -= S*2
    setn += C//4
else:
    setn = C//2
print(setn)