import math


def mennseki(r):
    S = r ** 2 * math.pi
    return S


def ennsyuu(r):
    R = 2 * r * math.pi
    return R


r = float(eval(input()))
print((mennseki(r), ennsyuu(r)))

