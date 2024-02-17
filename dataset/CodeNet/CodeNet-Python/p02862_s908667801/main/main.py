import math
x, y = list(map(int, input().split()))

mod = 10**9 +7
n = (x+y)//3	# 移動回数

if ((x+y)%3):
	print('0')
	exit()

x -= n
y -= n

if (x<0 or y<0):
	print('0')
	exit()

def cmb(n, r, mod):
    if ( r<0 or r>n ):
        return 0
    r = min(r, n-r)
    return g1[n] * g2[r] * g2[n-r] % mod
 
N = x+y
g1 = [1, 1]
g2 = [1, 1]
inverse = [0, 1]
 
for i in range( 2, N + 1 ):
    g1.append( ( g1[-1] * i ) % mod )
    inverse.append( ( -inverse[mod % i] * (mod//i) ) % mod )
    g2.append( (g2[-1] * inverse[-1]) % mod )
 
ans = cmb(x+y,x,mod)
print(ans)