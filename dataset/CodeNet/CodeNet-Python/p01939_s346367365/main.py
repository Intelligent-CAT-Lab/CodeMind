s = input()
n, m = s.split()
n = int(n)
m = int(m)

if n==1:
    print((m+1)%1000000007)
else:

    d = m // (n - 1)


    A = m - d * (n-1) + 1
    B = m - (n-1) + 1
    ans = (A+B)*d + (m+1)
    # ans = 2*(d*m+d)-(n-1)*(d+1)*d+m+1
    ans %= 1000000007
    print(ans)