c = {"1":"", "2":"k", "3":"s", "4":"t", "5":"n",
     "6":"h","7":"m", "8":"y", "9":"r", "0":"w"}
m = {"T":"a", "L":"i", "U":"u", "R":"e", "D":"o"}
s = "5R2D"
ans = ""
for i in range(0, len(s), 2):
  com = s[i:i+2]
  if com == "0U":ans += "nn"
  else:ans += c[com[0]] + m[com[1]]
print(ans)
