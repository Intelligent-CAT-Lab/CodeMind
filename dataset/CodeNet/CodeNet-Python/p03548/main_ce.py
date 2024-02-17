X,Y,Z=map(int,"13 3 1".split())
answer=0
width=Y+2*Z
while(width<=X):
  answer+=1
  width+=Y+Z
print(answer)