str1 = "abcabc"
char_order = []
ctr = {}
for c in str1:
  if c in ctr:
    ctr[c] += 1
  else:
    ctr[c] = 1 
    char_order.append(c)
for c in char_order:
  if ctr[c] == 1:
    print(c)
    break
else:
    print(None)