A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))
