from collections import deque
s = list(str("01B0"))
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