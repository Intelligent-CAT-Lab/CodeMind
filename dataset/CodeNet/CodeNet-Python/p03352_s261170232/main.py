import math
X = int(input())
answer = 0
for i in range(1,math.ceil(X**0.5)+1):
  for j in range(2,11):
    if i**j <= X:
      answer = max(i**j,answer)

print(answer)