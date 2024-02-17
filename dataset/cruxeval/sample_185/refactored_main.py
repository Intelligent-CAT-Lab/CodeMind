L = [16, 14, 12, 7, 9, 11]
N = len(L)
for k in range(1, N//2 + 1):
    i = k - 1
    j = N - k
    while i < j:
        # swap elements:
        L[i], L[j] = L[j], L[i]
        # update i, j:
        i += 1
        j -= 1
print(L)