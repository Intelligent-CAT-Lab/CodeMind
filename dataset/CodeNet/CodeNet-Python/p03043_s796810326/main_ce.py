n,k="3 10".split(' ')
n,k=int(n),int(k)
score=int()
r=1/n
for dice in range(1,n+1):
        counter=0
        mul=dice
        while mul<k:
            mul=mul*2
            counter+=1
        score+=r*((.5)**counter)
print(round(score,12))
