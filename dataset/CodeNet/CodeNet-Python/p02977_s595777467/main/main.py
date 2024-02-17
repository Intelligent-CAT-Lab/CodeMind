N=int(eval(input()))
if N&(N-1)==0:
    print("No")
else:
    print("Yes")
    if N%2==1:
        k=N//2
        for i in range(1,k+1):
            print((2*i,2*i+1))
            print((2*i+1,1))
            print((1,2*i+N))
            print((2*i+N,2*i+1+N))
        print((1+N,2))
    else:
        k=N//2-1
        for i in range(1,k+1):
            print((2*i,2*i+1))
            print((2*i+1,1))
            print((1,2*i+N))
            print((2*i+N,2*i+1+N))
        print((1+N,2))
        n=N.bit_length()-1
        a=2**n
        b=N+1-a
        print((N,a+N))
        print((2*N,b))
