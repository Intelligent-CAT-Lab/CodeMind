import math
N, K = map(int,input().split())
if (2*N)*(K+ K+2*N-1) > N*(K+2*N + K+3*N-1):
    print(-1)
    exit()
flag = [1]*(2*N)
for i in range(math.floor(N/2),N):
    a = K + i
    b = K + 2*N -1 -(i-math.floor(N/2))*2
    c = K + 3*N -1 -(i-math.floor(N/2))
    print(a,b,c)
for i in range(math.floor(N/2)):
    a = K + i
    b = K + 2*N -2 -i*2
    c = K + 3*N -1 -i-math.ceil(N/2)
    print(a,b,c)
