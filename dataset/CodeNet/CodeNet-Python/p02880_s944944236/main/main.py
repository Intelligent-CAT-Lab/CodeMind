n =int(eval(input()))
yes = True
primesand10=[10,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97]
if n <= 10:
  yes = True
elif n <= 81:
  for prime in primesand10:
    if n%prime == 0:
      yes = False
      break
else:
  yes = False

if yes:print("Yes")
else: print("No")