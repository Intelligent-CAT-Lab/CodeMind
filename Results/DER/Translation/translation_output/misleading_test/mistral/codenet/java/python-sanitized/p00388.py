# Test input:
H = int(input())
A = int(input())
B = int(input())

# Expected output:
ans = 0
for i in range(A, B+1):
    if H % i == 0:
        ans += 1
print(ans)