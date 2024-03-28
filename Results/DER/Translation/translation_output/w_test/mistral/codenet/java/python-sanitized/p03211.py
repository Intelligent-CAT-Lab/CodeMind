S = input()
min = 1000
for i in range(len(S) - 2):
    X = int(S[i:i+3])
    min = min(min, abs(X - 753))
print(min)