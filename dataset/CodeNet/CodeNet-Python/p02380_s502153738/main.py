from math import sqrt, sin, cos, pi

a, b, C = map(float, input().split())

#度からラジアンへ変換する
C = (C * pi) / 180

#余弦定理を使って計算する
c = sqrt(a**2 + b**2 - 2*a*b*cos(C))
height = b * sin(C)
size = a * height * (1/2)
length = a + b + c

#出力する
print('{:.8f}'.format(size))
print('{:.8f}'.format(length))
print('{:.8f}'.format(height))
