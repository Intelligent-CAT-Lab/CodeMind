a, b, c = map(int, "10 30 20".split())
ans = "No"
if a + b == c:
  ans = "Yes"
if a + c == b:
  ans = "Yes"
if b + c == a:
  ans = "Yes"
print(ans)