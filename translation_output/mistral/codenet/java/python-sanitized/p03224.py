import sys

N = int(input())
l = 1
for l in range(1, N):
    N -= l
if N != l:
    print("No")
    sys.stdout.flush()
    exit()
print("Yes")
print(l+1)

answer = [[0 for j in range(l)] for i in range(l+1)]
for i in range(0, l+1):
    string = ""
    string += str(l)
    j = 0
    for j in range(i):
        string += " "
        string += str(answer[j][i-1])
    for j in range(i, l):
        string += " "
        string += str(answer[i][j] = Index)
    print(string)

sys.stdout.flush()