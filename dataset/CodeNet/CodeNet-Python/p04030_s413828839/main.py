from collections import deque
s = list(str(input()))
ans = deque()
for i in s:
  if i == "B":
    if ans == deque([]):
      continue
    else:
      ans.pop()
  else:
    ans.append(i)
print("".join(ans))