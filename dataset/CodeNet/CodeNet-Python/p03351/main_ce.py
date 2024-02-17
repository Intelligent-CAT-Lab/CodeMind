a,b,c,d=map(int, "4 7 9 3".split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])