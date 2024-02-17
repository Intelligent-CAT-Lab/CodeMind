import math
n = list(map(int,"3 20".split()))
X = n[0]
Y = n[1]
k = (Y//X).bit_length()
print(k)