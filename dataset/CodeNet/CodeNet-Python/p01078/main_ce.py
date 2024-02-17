# AOJ 1593: Star
# Python3 2018.7.13 bal4u
import math
PI = 3.1415926535897932384626433832795
# area = n*r^2*sin(180/n)*cos(180k/n)*sec(180(k-1)/n), for n/k star
N, K = map(int, "5 2".split())
print(N*math.sin(PI/N)*math.cos(K*PI/N)/math.cos((K-1)*PI/N))
