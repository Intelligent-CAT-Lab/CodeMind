A, B = map(int, input().split())
L = [["."] * 99 + ["#"] if i%2 == 0 else ["."] + ["#"] * 99 for i in range(100)]
for i in range(B-1):
    L[1 + i%50 * 2][2 + i//50 * 2] = "."
for i in range(A-1):
    L[-2 - i%50 * 2][-3 - i//50 * 2] = "#"
print("100 100")
for s in L:
    print("".join(s))
