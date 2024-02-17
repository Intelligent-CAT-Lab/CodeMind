S = list(input())

C = list("CODEFESTIVAL2016")

cnt = 0
for i in range(len(C)):
    if S[i] != C[i]:
        cnt += 1
print(cnt)