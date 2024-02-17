m,f,b =map(int, "1000 3000 3000".split())
if m+f<b:
  print("NA")
elif m>=b:
  print("0")
else:
  print(b-m)
