from collections import deque
K=int("15")
que=deque([1,2,3,4,5,6,7,8,9])
for i in range(K):
    a=que.popleft()
    if not a%10==0:
        que.append(a*10+a%10-1)
    que.append(a*10+a%10)
    if not a%10==9:
        que.append(a*10+a%10+1)
print(a)
