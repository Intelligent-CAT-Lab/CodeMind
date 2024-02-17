N = input()

c = int(N[0])
K = len(N)
ans = c + 9 * (K - 1) - 1
for i in N[1:]:
    if i != "9":
        break
else:
    ans += 1

print(ans)