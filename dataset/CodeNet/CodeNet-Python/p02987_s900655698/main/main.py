s = list(eval(input()))
ans = "No"
if len(list(set(s))) == 2:
  ans = "Yes"

print(ans)