import math
A,B,X = [int(i) for i in "180 100 2400".split()]
ans1 = math.ceil(X/1000) * A
ans2 = math.ceil(X/500) * B
ans3 = math.floor(X/1000) * A + math.ceil((X % 1000)/500) * B
print(min(ans1,ans2,ans3))
