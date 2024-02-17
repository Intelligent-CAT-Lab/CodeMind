x = int("46979")
h = x // 3600
m = x % 3600//60
s = x % 60
print("{0}:{1}:{2}".format(h,m,s))