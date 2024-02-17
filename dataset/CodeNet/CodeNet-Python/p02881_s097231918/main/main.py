N=int(eval(input()))

answer=0

for i in range(int(pow(N,1/2)),0,-1):
    if N%i==0:
        answer=(i-1)+(N//i-1)
        break
print(answer)
