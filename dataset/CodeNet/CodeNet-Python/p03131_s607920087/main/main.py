k,a,b=list(map(int,input().split()))
kk=k



k-=a-1
ko=k//2
#print(ko)
print((max(ko*(b-a)+a+k%2,kk+1)))
