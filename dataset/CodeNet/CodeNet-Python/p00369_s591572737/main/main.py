n = eval(input())
length = len(n)
ans = 10

#2桁,1桁混合
lst = []
ind = 0
while ind < length:
  if n[ind] == "1" and ind + 1 <= length - 1:
    lst.append(int(n[ind:ind + 2]))
    ind += 2
  else:
    lst.append(int(n[ind]))
    ind += 1
if len(lst) >= 2:
  ans = min(ans, max(lst) - min(lst))

#n桁のみ
divisors = []
for i in range(1, length // 2 + 1):
  if length % i == 0:
    divisors.append(i)

for i in divisors:
  lst = []
  for j in range(0, length, i):
    lst.append(int(n[j:j + i]))
  ans = min(ans, max(lst) - min(lst))

print(ans)
