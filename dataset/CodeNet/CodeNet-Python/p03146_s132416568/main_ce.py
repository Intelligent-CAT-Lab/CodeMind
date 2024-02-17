s = int("8")
a = []
a.append(s)
elm = s
while True:
  if (elm%2 == 0):
    elm = elm//2
  else:
    elm = 3*elm + 1
  if elm in a:
    break
  else:
    a.append(elm)
print(len(a)+1)