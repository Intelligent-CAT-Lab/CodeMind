from math import factorial as f
k=int(eval(input()))
n=512
a="" 
for i in range(n-1,-1,-1):
 v=f(7+i)//f(i)//f(7)
 a="FESTIVA"+("L"*(k//v))+a
 k%=v
print(a)