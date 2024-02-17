n=int(eval(input()))
ant,bnt,cnt=1,1,1

for i in range(n) :
    ant=10*ant%1000000007
    bnt=9*bnt%1000000007
    cnt=8*cnt%1000000007

ans=(ant-(bnt*2-cnt))%1000000007

if ans>=0 :
    print(ans)
else :
    print((1000000007+ans)) 