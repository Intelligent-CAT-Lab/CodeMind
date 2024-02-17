S = str("C0DEFESTIVAL2O16")
A = 'CODEFESTIVAL2016'
cnt = 0
for i in range(len(A)):
    if A[i] != S[i]:
        cnt += 1
print(cnt)