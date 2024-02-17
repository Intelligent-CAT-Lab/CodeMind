#!/usr/bin/env python
# -*- coding: utf-8 -*-
 
def pow(a, b):
    if b == 1:return a
    if b%2 == 0: return pow(a*a, int(b/2))
    return a*pow(a*a, int(b/2))
 
def binaryOne(n, multi):
    l, r = 0, n
    mid = (l + r)/2    
    while r - l > 1:
        if pow(mid, multi) >= n:
            r = mid
        else:
            l = mid
        mid = (r + l)/2
    return r;
 
 
def binaryTwo(n, maxi, multi):
    l, r = 0, multi
    mid = (l + r)/2
    while r - l > 1:
        if pow(maxi, (multi - mid))*pow(maxi - 1, mid) >= n:
            l = mid
        else:
            r = mid
        mid = (r + l)/2;
    return l
 
n, a = map(int,raw_input().split(" "))
ans = 1e18
for i in xrange(0, 40):
    maxi = binaryOne(n, i + 1);
    subt = binaryTwo(n, maxi, i + 1)
    ans = min(ans, a*i + maxi*(i + 1) - subt)
    
print ans