import math
v = 120
t = 35
windchill = 13.12 + 0.6215*t -  11.37*math.pow(v, 0.16) + 0.3965*t*math.pow(v, 0.16)
print(int(round(windchill, 0)))