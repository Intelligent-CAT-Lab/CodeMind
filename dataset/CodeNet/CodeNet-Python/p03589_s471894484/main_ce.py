N=int("2")
def ok(h,n,w,N):
    if 4*h*n*w==N*(n*w+n*h+h*w):
        return 1
    else:
        return 0
def kiyaku(a,b):
    if b%a==0:
        return 1
    else:
        return 0
def solve(N):
    for i in range(N//4+1,3*N//4+1):
        for j in range(3*N//4+1,3501):
            if 4*i*j-N*(i+j)>0 and kiyaku(4*i*j-N*(i+j),N*i*j):
                return (i,j,N*i*j//(4*i*j-N*(i+j)))
h,n,w=solve(N)
print(h,n,w)