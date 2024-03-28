T = input()
N = len(T)

oneSum = 0
indexes = []
for i in range(N):
    if T[i] == '1':
        length = 0
        for j in range(i, N):
            if T[j] == '1':
                length += 1
            else:
                break
        if length % 2 == 1:
            indexes.append(i - (oneSum - len(indexes)))
        oneSum += length
        i += length

zeroSum = N - oneSum
ans = (zeroSum + 1) * (oneSum - len(indexes)) / 2

for i in range(len(indexes)):
    index = indexes[i]
    ans += zeroSum + 1 - (index - i + (1 + i % 2)) / 2

for i in range(oneSum - 1, 0, -1):
    ans += (i + 1) / 2

print(int(ans))