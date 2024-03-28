S = input()
min = 1000
for i in range(0, len(S)-2):
    X = int(S[i:i+3])
    min = min if min < abs(X-753) else abs(X-753)
print(min)