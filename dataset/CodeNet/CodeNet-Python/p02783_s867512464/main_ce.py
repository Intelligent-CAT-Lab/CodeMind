h, a = "10 4".split();
h = int(h);
a = int(a);
if h % a == 0:
  ans = int(h // a);
else:
  ans = int(h // a + 1);
print(ans);
