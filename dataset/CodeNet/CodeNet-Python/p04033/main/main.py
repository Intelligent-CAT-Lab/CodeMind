# B 
si = lambda: eval(input())
ni = lambda: int(eval(input()))
nm = lambda: list(map(int, input().split()))
nl = lambda: list(map(int, input().split()))
a,b=nm()

if a<=0<=b:
    print('Zero')
elif b<0:
    if (b-a+1)%2==1:
        print('Negative')
    elif (b-a+1)%2==0:
        print('Positive')
elif 0<a:
    print('Positive')
    
