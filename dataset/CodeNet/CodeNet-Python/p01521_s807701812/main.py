s = list(input())
while True:
  if "o" not in s:
    print("x")
    break
  if s[-1] == "x":
    while s[-1] == "x":s.pop()
  elif s[0] == "x":
    while s[0] == "x":s.pop(0)
  
  if "x" not in s:
    print("o")
    break
  if s[-1] == "o":
    while s[-1] == "o":s.pop()
  elif s[0] == "o":
    while s[0] == "o":s.pop(0)


