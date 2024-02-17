import numpy as np
N = int(eval(input()))

def Num_Each_Digit(N,limit):
    ans = np.array([])
    
    if N < 10**(limit):
        for i in range(1,limit+1):
            if (10**(i-1) > N):
                break
            if i == 1:
                ans = np.append( ans, (N%(10**i)))
            elif i > 1:
                ans = np.append( ans, (N%(10**i)-N%(10**(i-1)))/(10**(i-1)))

        return ans
                
    else:
        print("too large")
        return N
    
digit = Num_Each_Digit(N,10)
    
if N == 10**(len(digit)-1):
    print((10))
    
else:
    print((int(np.sum(digit))))
