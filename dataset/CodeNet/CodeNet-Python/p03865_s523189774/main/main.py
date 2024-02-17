s = eval(input())
n = len(s)
if s[0] == s[-1]:
  n += 1
  
print(("First" if n % 2 else "Second"))