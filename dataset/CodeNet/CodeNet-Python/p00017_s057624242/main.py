import sys, string
alpha = 'abcdefghijklmnopqrstuvwxyza'
tbl = string.maketrans(alpha[:-1], alpha[1:])
for s in sys.stdin:
  while not('the' in s or 'this' in s or 'that' in s):
    s = s.translate(tbl)
  print s[:-1]