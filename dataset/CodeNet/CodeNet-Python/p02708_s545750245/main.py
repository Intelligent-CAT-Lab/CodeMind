n,k=map(int,input().split())
tot=0

for i in range(k,n+2):
  tot+=n+2-i+(i-1)*(n+1-i)
  
print(str(tot%1000000007))