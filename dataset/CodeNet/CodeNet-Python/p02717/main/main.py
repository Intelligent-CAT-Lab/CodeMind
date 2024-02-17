# スペース区切りの整数の入力
X,Y,Z = list(map(int, input().split()))

A=X
B=Y
C=Z

B=X
C=Y
A=Z

print((A,B,C))