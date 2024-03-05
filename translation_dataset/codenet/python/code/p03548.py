X,Y,Z=map(int,input().split())

answer=0
width=Y+2*Z
while(width<=X):
  answer+=1
  width+=Y+Z
  
print(answer)