fib=[0]*45
fib[0]=1
fib[1]=1

n=int(eval(input()))

for i in range(2,45):
    fib[i]=fib[i-1]+fib[i-2]
    
    
print((fib[n]))

