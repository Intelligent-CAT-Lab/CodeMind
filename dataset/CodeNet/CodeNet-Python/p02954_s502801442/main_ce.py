S = "RRLRL" + 'O'
N = len(S)
n = [0] * (N - 1)
t = []
i = 0
j =  0
while S[i] != 'O':
    count = 0
    if S[i] == 'R':
        while S[i] == 'R':
            count += 1
            i += 1
    elif S[i] == 'L':
        while S[i] == 'L':
            count += 1
            i += 1
    t.append(count)
T = int(len(t)/2)  # len(t)は必ず偶数
for i in range(T):
    j += t[2*i]
    if t[2*i] % 2 == 0:
        if t[2*i + 1] % 2 == 0:
            n[j - 1] = int((t[2*i] + t[2*i + 1])/2)
            n[j] = n[j - 1]
        elif t[2*i + 1] % 2 == 1:
            n[j - 1] = int((t[2*i] + t[2*i + 1] - 1)/2)
            n[j] = n[j - 1] + 1
    elif t[2*i] % 2 == 1:
        if t[2*i + 1] % 2 == 0:
            n[j - 1] = int((t[2*i] + t[2*i + 1] + 1)/2)
            n[j] = n[j - 1] - 1
        elif t[2*i + 1] % 2 == 1:
            n[j - 1] = int((t[2*i] + t[2*i + 1])/2)
            n[j] = n[j - 1]
    j += t[2*i+1]
print(' '.join(map(str, n)))
