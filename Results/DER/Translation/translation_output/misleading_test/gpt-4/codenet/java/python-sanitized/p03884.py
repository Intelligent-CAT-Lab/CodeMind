def solve(k):
    dptable = [[0 for _ in range(8)] for _ in range(601)]
    dptable[0][0] = 1
    for i in range(1, 601):
        dptable[i][0] = 1
        for j in range(1, 8):
            dptable[i][j] = dptable[i-1][j] + dptable[i][j-1]

    countC = [0] * 601
    for i in range(600, 0, -1):
        while k >= dptable[i][7]:
            countC[i] += 1
            k -= dptable[i][7]

    result = []
    for i in range(1, 601):
        result.append("FESTIVA")
        for _ in range(countC[i]):
            result.append("L")
    return ''.join(result)

# Sample test case
k = 7
print(solve(k))